package guru.springframework.didemo.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean() {
        System.out.println("## Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Factory set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## Name set: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## Post Construct annotated method call");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## Pre Destroy annotated method call");
    }

    public void beforeInit() {
        System.out.println("## Post Processor -> Before Init");
    }

    public void afterInit() {
        System.out.println("## Post Processor - After Init");
    }
}
