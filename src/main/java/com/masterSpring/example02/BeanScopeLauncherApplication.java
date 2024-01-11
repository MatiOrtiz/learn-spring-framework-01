package com.masterSpring.example02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//This class implements Spring Singleton
@Component
class NormalClass{

}


//This class implements Spring Prototype
@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        //Prints by Singleton
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        //Prints by Prototype
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));

    }

}
