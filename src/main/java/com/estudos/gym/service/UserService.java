package com.estudos.gym.service;

import com.estudos.gym.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> getAllUsers();
    User getUserByEmail(String email);
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
