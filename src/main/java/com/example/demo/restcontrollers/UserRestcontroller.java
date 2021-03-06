package com.example.demo.restcontrollers;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestcontroller {

    @Autowired
    private UserService userService;
    @GetMapping()
    public List<UserEntity>find(){
       return userService.find();

    }
    @PostMapping()
    public UserEntity save(@RequestBody UserEntity userEntity){
        return userService.save(userEntity);

    }
}
