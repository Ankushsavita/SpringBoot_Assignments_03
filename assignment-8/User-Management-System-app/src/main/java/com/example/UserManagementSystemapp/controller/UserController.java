package com.example.UserManagementSystemapp.controller;

import com.example.UserManagementSystemapp.model.User;
import com.example.UserManagementSystemapp.service.IUserService;
import com.example.UserManagementSystemapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-app")
public class UserController {

    @Autowired
    private IUserService userService;


    // http://localhost:8080/api/v1/user-app/add-user
    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }


    // http://localhost:8080/api/v1/user-app/find-all-users
    @GetMapping("find-all-users")
    public List<User> findAllUser(){
        return userService.findAll();
    }


    // http://localhost:8080/api/v1/user-app/find-user/userId/5
    @GetMapping("find-user/userId/{userId}")
    public User findUserById(@PathVariable int userId){
        return  userService.findUserById(userId);
    }



    // http://localhost:8080/api/v1/user-app/update-user/userId/5
    @PutMapping("update-user/userId/{userId}")
    public void updateUser(@PathVariable int userId,@RequestBody User user){
        userService.updateUser(userId,user);
    }


    // http://localhost:8080/api/v1/user-app/delete-todo/userId/5
    @DeleteMapping("delete-todo/userId/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
    }
}
