package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello! - ORIGINAL";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
