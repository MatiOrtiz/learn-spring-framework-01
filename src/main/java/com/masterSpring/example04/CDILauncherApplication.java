package com.masterSpring.example04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.crypto.Data;
import java.util.Arrays;

@Named
class BusinessClass{
    DataService dataService;

    @Inject
    public void setDataService(DataService dataService){
        this.dataService= dataService;
        System.out.println("Setter Injection");
    }

    public DataService getDataService(){
        return dataService;
    }
}

@Component
class DataService{

}

@Configuration
@ComponentScan
public class CDILauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(CDILauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        context.getBean(BusinessClass.class).getDataService();

    }

}
