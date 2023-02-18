package com.example.UserManagementSystemapp.service;
import com.example.UserManagementSystemapp.model.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll();

    public User findUserById(int userId);

    public void addUser(User user);

    public void deleteUser(int userId);

    public void updateUser(int userId, User newUser);
}
