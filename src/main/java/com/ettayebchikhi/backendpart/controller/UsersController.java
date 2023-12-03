package com.ettayebchikhi.backendpart.controller;

import com.ettayebchikhi.backendpart.models.AppUser;
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
    public ResponseEntity<List<AppUser>> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("add")
    public ResponseEntity<AppUser> addUser(@RequestBody AppUser user){
        return userService.addUser(user);
    }
    @PostMapping("random")
    public ResponseEntity<AppUser> addRandomUser(){
        return userService.addUser();
    }
}
