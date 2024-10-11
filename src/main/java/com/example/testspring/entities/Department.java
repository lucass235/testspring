package com.example.testspring.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
@Document(collection = "tb_department")
public class Department {

    @Id
    private Long id;
    private String name;

}
