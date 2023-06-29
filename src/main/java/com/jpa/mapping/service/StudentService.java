package com.jpa.mapping.service;

import com.jpa.mapping.dto.ApiResponse;
import com.jpa.mapping.dto.StudentRequestDto;
import com.jpa.mapping.model.StudentModel;

public interface StudentService {
    StudentModel addStudent(StudentRequestDto studentRequestDto) throws Exception;


}
