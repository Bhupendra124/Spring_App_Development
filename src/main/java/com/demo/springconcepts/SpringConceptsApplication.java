package com.demo.springconcepts;

import com.demo.springconcepts.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringConceptsApplication {

    public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);


    /**
     * Purpose : Printing the logging message based on the pattern provided in logback.xml
     Since logger.debug is mentioned, so it will display the logging message from and above
     the DEBUG level.
     */
    public static void main(String[] args) {
        logger.debug("Welcome to Spring Concept Demo");
        ApplicationContext context=SpringApplication.run(SpringConceptsApplication.class, args);

        DemoBean demoBean=context.getBean(DemoBean.class);
       logger.debug("Demo Bean "+demoBean.toString());




   /**     Using Employee Bean and Department Bean, demonstrate
        Dependency Injection - Note – EmployeeBean and DepartBean are both
        Component as identified by Annotation and their
        corresponding Objects retrieved using Application
                Context
                /*
    */

        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(100);
        employeeBean.setEname("This is spring framwork");
        employeeBean.showEmployeeDetails();
    }

}
