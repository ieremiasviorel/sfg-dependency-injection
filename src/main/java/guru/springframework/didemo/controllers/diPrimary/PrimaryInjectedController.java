package guru.springframework.didemo.controllers.diPrimary;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
