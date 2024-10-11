package com.example.testspring.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
@Document(collection = "tb_user")
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;

}
