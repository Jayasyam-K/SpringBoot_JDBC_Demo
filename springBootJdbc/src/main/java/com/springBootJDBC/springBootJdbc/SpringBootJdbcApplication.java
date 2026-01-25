package com.springBootJDBC.springBootJdbc;

import com.springBootJDBC.springBootJdbc.model.Student;
import com.springBootJDBC.springBootJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Jay");
		s.setMarks(79);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		//Fetch all the students
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
