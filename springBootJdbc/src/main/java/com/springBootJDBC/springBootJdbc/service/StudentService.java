package com.springBootJDBC.springBootJdbc.service;

import com.springBootJDBC.springBootJdbc.model.Student;
import com.springBootJDBC.springBootJdbc.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        //System.out.println("Added");
        repo.save(s);
    }
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
