package guru.springframework.didemo.services.diProfiles;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("profileInjectedService")
@Profile({"en", "default"})
public class EnglishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public EnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
