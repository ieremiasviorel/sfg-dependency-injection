package guru.springframework.didemo.services.diTypes;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello! - CONSTRUCTOR";
    }
}
