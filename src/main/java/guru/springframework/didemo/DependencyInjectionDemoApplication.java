package guru.springframework.didemo;

import guru.springframework.didemo.config.FakeDataSource;
import guru.springframework.didemo.config.FakeJmsBroker;
import guru.springframework.didemo.controllers.*;
import guru.springframework.didemo.services.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        ctx.getBean(LifeCycleDemoBean.class);

        System.out.println(ctx.getBean(SpringInjectionController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PrimaryInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker);
    }
}
