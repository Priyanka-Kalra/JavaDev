package com.springDemo;

import com.springDemo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        1.XML Based Configuration
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj=(Alien) context.getBean("alien");
//        obj.code();
//        System.out.println("Age :"+ obj.getAge());
//        System.out.println("Marks :"+ obj.getMarks());


//        2.JAVA Based Configuration
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt=context.getBean("desktop",Desktop.class);
        Desktop dt=context.getBean(Desktop.class);
//        Desktop dt1=context.getBean(Desktop.class);
        Alien obj=context.getBean(Alien.class);
        obj.code();
        System.out.println("Age :"+ obj.getAge());
        System.out.println("Marks :"+ obj.getMarks());





    }
}
