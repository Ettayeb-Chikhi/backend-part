package com.ettayebchikhi.backendpart.controller;

import com.ettayebchikhi.backendpart.models.User;
import com.ettayebchikhi.backendpart.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;
    @GetMapping("get")
    public ResponseEntity<List<User>> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("add")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @PostMapping("random")
    public ResponseEntity<User> addRandomUser(){
        return userService.addUser();
    }
}
