package com.sprinbootdemo.app;

import com.sprinbootdemo.app.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);

//		Way to create an object
//		Alien obj=new Alien();
//		obj.code();

		Alien obj=context.getBean(Alien.class);
		System.out.println("Age :"+obj.getAge());
		obj.code();



	}

}
