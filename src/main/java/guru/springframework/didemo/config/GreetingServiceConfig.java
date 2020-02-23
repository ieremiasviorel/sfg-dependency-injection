package guru.springframework.didemo.config;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean("greetingServiceJavaBasedConfig")
    @Profile({"en", "default"})
    GreetingService englishGreetingServiceBean(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean("greetingServiceJavaBasedConfig")
    @Profile("de")
    GreetingService germanGreetingServiceBean(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean("greetingServiceJavaBasedConfig")
    @Profile("es")
    GreetingService spanishGreetingServiceBean(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean("greetingServiceJavaBasedConfig")
    @Profile("fr")
    GreetingService frenchGreetingServiceBean(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("fr");
    }
}
