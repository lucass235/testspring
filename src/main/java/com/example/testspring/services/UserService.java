package com.example.testspring.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.testspring.entities.User;
import com.example.testspring.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public User update(User user) {
        User userEntity = this.findById(user.getId());
        BeanUtils.copyProperties(user, userEntity, "id");
        return this.userRepository.save(userEntity);
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }

}
