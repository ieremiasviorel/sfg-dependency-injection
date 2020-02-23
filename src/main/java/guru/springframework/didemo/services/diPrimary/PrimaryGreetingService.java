package guru.springframework.didemo.services.diPrimary;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello! - PRIMARY";
    }
}
