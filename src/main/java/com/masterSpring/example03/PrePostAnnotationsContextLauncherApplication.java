package com.masterSpring.example03;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency= someDependency;
        System.out.println("All the dependencies are ready");
    }

    @PostConstruct
    public void itialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("CleanUp");
    }

}

@Component
class SomeDependency {
    public void getReady(){
        System.out.println("Some logic using someDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }

}
