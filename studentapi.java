package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MODEL.STUDENT;

@RestController
@RequestMapping("/student")
public class studentapi {
	STUDENT student;
    @GetMapping("/{name}") // Note the {name} placeholder
    public STUDENT getStudentDetails(@PathVariable String name) {
        // Here you can implement logic to fetch student details by name
        // For this example, I'll just create a new student object with fixed details
        return student;
    }
    @PostMapping
     public String createstudentdetails(@RequestBody STUDENT student)
     {
    	this.student=student;
    	return "Student details created sucessfully";
     }
    @PutMapping
    public String UpdateStudentDetails(@RequestBody STUDENT student)
    {
    	this.student=student;
    	return "student details updated";
    }
    @DeleteMapping("/{name}")
    public String Deletestudentdetails(@PathVariable String name)
    {
    	this.student=null;
    	return "student details deleted";
    }
}
