package com.jpa.mapping.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jpa.mapping.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequestDto {

    private Long studentId;
    private String name;
    private String email;
    private Address address;
}
