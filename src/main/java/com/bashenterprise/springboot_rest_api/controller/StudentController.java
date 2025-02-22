package com.bashenterprise.springboot_rest_api.controller;

import com.bashenterprise.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Ade", "Baba"));
        students.add(new Student(2L, "Shola", "Ogun"));
        students.add(new Student(3L, "Tola", "Ola"));
        students.add(new Student(4L, "Folu", "Akin"));
        students.add(new Student(5L, "Gbenga", "Oye"));
        students.add(new Student(6L, "Ajayi", "Akanni"));
        students.add(new Student(7L, "Dolapo", "Majekodunmi"));

        return students;
    }

    //SPRING BOOT REST API with PATH VARIABLE Annotation
    //Path variable binds method argument to URI template
    //URI template {id}

    @GetMapping("/student/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(
            @PathVariable int id,
            @PathVariable("first-name") String firstName,
            @PathVariable("last-name") String lastName){
        return new Student(id, firstName, lastName);
    }
}
