package com.example.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tb_user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

}
