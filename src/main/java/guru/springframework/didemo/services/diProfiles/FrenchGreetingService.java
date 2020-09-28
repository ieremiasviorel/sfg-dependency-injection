package guru.springframework.didemo.services.diProfiles;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("profileInjectedService")
@Profile("fr")
public class FrenchGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public FrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getFrenchGreeting();
    }
}
