package com.example.testspring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.testspring.entities.Department;

@Repository
public interface DepartmentRepository  extends MongoRepository<Department, Long> {

}
