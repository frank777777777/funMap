package me.funmap.controller;

import me.funmap.model.User;
import me.funmap.service.impl.UserSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSV userService;


    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        User result = userService.getUserById(id);
        return result;
    }

    @GetMapping("/search/{name}")
    public List<User> searchUsersByName(@PathVariable String name){
        return userService.searchUsers(name);
    }

    @DeleteMapping("/{id}")
    public void removeUserById(@PathVariable Long id){
        userService.removeUserById(id);
    }

    @PostMapping("/")
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
        ServletUriComponentsBuilder bd = ServletUriComponentsBuilder.fromCurrentContextPath();

    }

    @PutMapping("/")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }



}
