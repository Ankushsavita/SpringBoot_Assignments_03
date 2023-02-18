package com.example.UserManagementSystemapp.service;

import com.example.UserManagementSystemapp.model.User;
import com.example.UserManagementSystemapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService{

    private static List<User> users = new ArrayList<>();

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int userId){
        return userRepository.findById(userId).get();
    }

    @Override
    public void addUser(User user){
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId){
        userRepository.deleteById(userId);
    }



    @Override
    public void updateUser(int userId, User newUser){
        User user = userRepository.findById(userId).get();

        user.setUserId(newUser.getUserId());
        user.setUserName(newUser.getUserName());
        user.setDateOfBirth(newUser.getDateOfBirth());
        user.setEmail(newUser.getEmail());
        user.setPhoneNo(newUser.getPhoneNo());
        user.setDate(newUser.getDate());
        user.setTime(newUser.getTime());

        userRepository.save(user);
    }




}
