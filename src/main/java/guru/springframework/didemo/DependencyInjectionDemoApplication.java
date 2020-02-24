package guru.springframework.didemo;

import guru.springframework.didemo.config.FakeDataSource;
import guru.springframework.didemo.config.FakeJmsBroker;
import guru.springframework.didemo.controllers.JavaBasedConfigController;
import guru.springframework.didemo.controllers.SpringInjectionController;
import guru.springframework.didemo.controllers.diPrimary.PrimaryInjectedController;
import guru.springframework.didemo.controllers.diProfiles.ProfileInjectedController;
import guru.springframework.didemo.controllers.diTypes.ConstructorInjectedController;
import guru.springframework.didemo.controllers.diTypes.PropertyInjectedController;
import guru.springframework.didemo.controllers.diTypes.SetterInjectedController;
import guru.springframework.didemo.services.lifeCycle.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        // get Spring application dependency context
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        // get bean from dependency context based on class name
        System.out.println("---- Injection from application context using class name");
        System.out.println(ctx.getBean(SpringInjectionController.class).sayHello());

        // get bean from dependency context based on class name
        System.out.println("---- Injection from application context using bean name");
        System.out.println(((SpringInjectionController) ctx.getBean("springInjectionController")).sayHello());

        System.out.println("---- Injection using property");
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

        System.out.println("---- Injection using setter");
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

        System.out.println("---- Injection using constructor");
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        System.out.println("---- Injection using primary bean");
        System.out.println(ctx.getBean(PrimaryInjectedController.class).sayHello());

        System.out.println("---- Injection based on profile");
        System.out.println(ctx.getBean(ProfileInjectedController.class).sayHello());

        System.out.println("---- Injection based on Java config");
        System.out.println(ctx.getBean(JavaBasedConfigController.class).sayHello());

        // Lifecycle methods demo
        ctx.getBean(LifeCycleDemoBean.class);

        System.out.println("---- External properties - datasource config");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);

        System.out.println("---- External properties - messaging config");
        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker);
    }
}
