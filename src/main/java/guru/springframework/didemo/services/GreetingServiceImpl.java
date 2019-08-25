package guru.springframework.didemo.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class GreetingServiceImpl implements GreetingService, InitializingBean, DisposableBean {

    public static final String HELLO = "Hello! - ORIGINAL";

    @Override
    public String sayGreeting() {
        return HELLO;
    }

    @Override
    public void destroy() {
        System.out.println("Bean destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Bean init");
    }

    @PostConstruct
    public void afterConstruct() {
        System.out.println("Bean use");
    }

    @PreDestroy
    public void preDestruction() {
        System.out.println("Bean before destroy");
    }
}
