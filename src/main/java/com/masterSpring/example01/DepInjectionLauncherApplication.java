package com.masterSpring.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        this.dependency1= dependency1;
        this.dependency2= dependency2;
        System.out.println("Constructor Injection - YourBusinessClass");
    }

}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);

    }

}
