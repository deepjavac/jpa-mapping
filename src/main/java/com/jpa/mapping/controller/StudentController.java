package com.jpa.mapping.controller;

import com.jpa.mapping.dto.ApiResponse;
import com.jpa.mapping.dto.StudentRequestDto;
import com.jpa.mapping.model.StudentModel;
import com.jpa.mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public StudentModel addStudent(@RequestBody StudentRequestDto studentRequestDto) throws Exception{
      return studentService.addStudent(studentRequestDto);

    }
}
