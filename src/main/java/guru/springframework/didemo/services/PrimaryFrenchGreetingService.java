package guru.springframework.didemo.services;

public class PrimaryFrenchGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getFrenchGreeting();
    }
}
