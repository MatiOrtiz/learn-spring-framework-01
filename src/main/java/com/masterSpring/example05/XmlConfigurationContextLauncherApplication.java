package com.masterSpring.example05;

import com.masterSpring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ContextConfiguration.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        context.getBean(GameRunner.class).run();

    }

}
