package com.masterSpring.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);

    }

}

