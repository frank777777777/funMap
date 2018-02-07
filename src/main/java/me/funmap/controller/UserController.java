package me.funmap.controller;

import me.funmap.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/register")
    public void register(User user){
        return;
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return
    }
}
