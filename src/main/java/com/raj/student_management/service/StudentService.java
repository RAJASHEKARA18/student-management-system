package com.raj.student_management.service;

import com.raj.student_management.Repository.StudentRepository;
import com.raj.student_management.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student create(Student s)
    {
        return repo.save(s);

    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentById(Integer id)
    {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }

}
