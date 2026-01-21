package com.priyanka.springJpa;

import com.priyanka.springJpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

//		creating and storing
//		Student s1=context.getBean(Student.class);
//		Student s2=context.getBean(Student.class);
//		Student s3=context.getBean(Student.class);
//
//		s1.setRollNum(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//
//		s2.setRollNum(102);
//		s2.setName("Kiran");
//		s2.setMarks(80);
//
//
//		s3.setRollNum(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		fetching
//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(101));

		//using optional to avoid Null pointer exception in case object doesnt exists
//		Optional<Student> s=repo.findById(105);
//		System.out.println(s.orElse(new Student()));


		//JPQL
//		System.out.println(repo.findByName("Harsh"));
//		System.out.println(repo.findByMarksGreaterThan(75));

//		update
//		Student s2=context.getBean(Student.class);
//		s2.setRollNum(102);
//		s2.setName("Priyanka");
//		s2.setMarks(80);
//		repo.save(s2);


//		delete
		Student s2=context.getBean(Student.class);
		s2.setRollNum(102);
		s2.setName("Priyanka");
		s2.setMarks(80);
		repo.delete(s2);

	}

}
