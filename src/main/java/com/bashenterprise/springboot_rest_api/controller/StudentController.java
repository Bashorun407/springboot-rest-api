package com.bashenterprise.springboot_rest_api.controller;

import com.bashenterprise.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //http://localhost:8080/student

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(
                1L,
                "Babade",
                "Hubert"
        );
    return student;
    }
}
