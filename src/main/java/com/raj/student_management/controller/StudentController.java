package com.raj.student_management.controller;

import com.raj.student_management.model.Student;
import com.raj.student_management.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Student create(@Valid @RequestBody Student s)
    {
        return service.create(s);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudentDetails()
    {
        return service.getAllStudents();
    }

    @GetMapping("/getById/{id}")
    public Student getStudentDetailsById(@PathVariable int id)
    {
        return service.getStudentById(id);
    }

}
