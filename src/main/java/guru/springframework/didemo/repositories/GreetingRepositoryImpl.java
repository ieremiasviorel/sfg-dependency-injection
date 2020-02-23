package guru.springframework.didemo.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello! - ENGLISH";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola! - SPANISH";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo! - GERMAN";
    }

    @Override
    public String getFrenchGreeting() {
        return "Salut! - FRENCH";
    }
}
