package com.springBootJDBC.springBootJdbc;

import com.springBootJDBC.springBootJdbc.model.Student;
import com.springBootJDBC.springBootJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Jay");
		s.setMarks(79);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
	}

}
