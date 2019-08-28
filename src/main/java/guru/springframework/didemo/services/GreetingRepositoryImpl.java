package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello! - PRIMARY";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola! - PRIMARIO";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo! - PRIMAR";
    }

    @Override
    public String getFrenchGreeting() {
        return "Salut! - PRIMAIRE";
    }
}
