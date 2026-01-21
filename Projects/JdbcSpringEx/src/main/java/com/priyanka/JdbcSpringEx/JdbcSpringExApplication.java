package com.priyanka.JdbcSpringEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.priyanka.JdbcSpringEx.model.Student;
import com.priyanka.JdbcSpringEx.service.StudentService;


@SpringBootApplication
public class JdbcSpringExApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(JdbcSpringExApplication.class, args);

		Student s=context.getBean(Student.class);
		s.setRollNum(101);
		s.setName("Priyanka");
		s.setMarks(78);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}
