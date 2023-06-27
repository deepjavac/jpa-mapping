package com.jpa.mapping.repository;

import com.jpa.mapping.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {
}
