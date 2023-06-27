package com.jpa.mapping.serviceImpl;

import com.jpa.mapping.dto.ApiResponse;
import com.jpa.mapping.model.Address;
import com.jpa.mapping.model.StudentModel;
import com.jpa.mapping.repository.StudentRepo;
import com.jpa.mapping.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentRepo studentRepo;
    @Override
    public StudentModel addStudent(StudentModel studentModel) throws Exception{
        Address address = new Address();



         studentModel = studentRepo.save(studentModel);

             address.setStudent(studentModel);
             studentModel.setAddress(address);




         return studentModel;


    }


}
