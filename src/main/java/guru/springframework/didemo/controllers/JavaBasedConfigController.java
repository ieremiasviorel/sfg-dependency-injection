package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class JavaBasedConfigController {
    private final GreetingService greetingService;

    // add @Qualifier in order not to clash with @Primary and still inject the desired implementation
    public JavaBasedConfigController(@Qualifier("greetingServiceJavaBasedConfig") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
