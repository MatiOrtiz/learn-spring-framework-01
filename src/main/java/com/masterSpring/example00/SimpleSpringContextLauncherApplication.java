package com.masterSpring.example00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);

    }

}

