package guru.springframework.didemo.controllers;

import guru.springframework.didemo.DependencyInjectionDemoApplication;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.assertEquals;

public class SpringInjectionControllerTest {

    private SpringInjectionController springInjectionController;

    @Before
    public void setUp() {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, new String[0]);

        this.springInjectionController = (SpringInjectionController) ctx.getBean("springInjectionController");
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO, this.springInjectionController.sayHello());
    }
}
