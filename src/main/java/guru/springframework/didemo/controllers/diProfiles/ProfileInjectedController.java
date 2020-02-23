package guru.springframework.didemo.controllers.diProfiles;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileInjectedController {

    private final GreetingService greetingService;

    // add @Qualifier in order not to clash with @Primary and still inject the desired implementation
    public ProfileInjectedController(@Qualifier("profileInjectedService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
