package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Spring Concept Demo");
        ApplicationContext context= (ApplicationContext) SpringApplication.run(SpringConceptsApplication.class, args);
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println("Demo Bean "+demoBean.toString());
        System.out.println(context.getBean(DemoBean.class));
    }

}
