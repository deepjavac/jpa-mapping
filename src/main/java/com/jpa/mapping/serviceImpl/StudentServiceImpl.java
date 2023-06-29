package com.jpa.mapping.serviceImpl;

import com.jpa.mapping.dto.ApiResponse;
import com.jpa.mapping.dto.StudentRequestDto;
import com.jpa.mapping.model.Address;
import com.jpa.mapping.model.StudentModel;
import com.jpa.mapping.repository.StudentRepo;
import com.jpa.mapping.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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
    public StudentModel addStudent(StudentRequestDto studentRequestDto) throws Exception{
        Address address = new Address();
        //address.setCity(studentRequestDto.getAddress().getCity());
        //address.setState(studentRequestDto.getAddress().getState());
        BeanUtils.copyProperties(studentRequestDto.getAddress(), address);
        StudentModel studentModel = new StudentModel();
        BeanUtils.copyProperties(studentRequestDto, studentModel);


         studentModel = studentRepo.save(studentModel);

             address.setStudent(studentModel);
             studentModel.setAddress(address);




         return studentModel;


    }


}
