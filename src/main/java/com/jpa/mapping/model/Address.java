package com.jpa.mapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addId;
    private String city;
    private String state;

    @OneToOne(mappedBy = "address", fetch = FetchType.EAGER)
   // @JsonIgnore
    private StudentModel student;
}
