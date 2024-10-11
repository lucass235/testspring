package com.example.testspring.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.testspring.entities.Department;
import com.example.testspring.repositories.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }

    public Department findById(Long id) {
        return this.departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public Department save(Department department) {
        return this.departmentRepository.save(department);
    }

    public Department update(Long id, Department department) {
        Department departmentEntity = this.findById(department.getId());
        BeanUtils.copyProperties(department, departmentEntity, "id");
        return this.departmentRepository.save(departmentEntity);
    }

    public void delete(Long id) {
        this.departmentRepository.deleteById(id);
    }

}
