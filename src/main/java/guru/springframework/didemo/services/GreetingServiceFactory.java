package guru.springframework.didemo.services;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.diProfiles.EnglishGreetingService;
import guru.springframework.didemo.services.diProfiles.FrenchGreetingService;
import guru.springframework.didemo.services.diProfiles.GermanGreetingService;
import guru.springframework.didemo.services.diProfiles.SpanishGreetingService;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new EnglishGreetingService(greetingRepository);
            case "de":
                return new GermanGreetingService(greetingRepository);
            case "es":
                return new SpanishGreetingService(greetingRepository);
            case "fr":
                return new FrenchGreetingService(greetingRepository);
            default:
                return null;
        }
    }
}
