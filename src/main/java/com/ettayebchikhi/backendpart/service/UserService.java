package com.ettayebchikhi.backendpart.service;

import com.ettayebchikhi.backendpart.models.User;
import com.ettayebchikhi.backendpart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public ResponseEntity<List<User>> getUsers() {

        return  ResponseEntity.ok(userRepository.getAllUsers());
    }

    public ResponseEntity<User> addUser(User user) {
        return ResponseEntity.ok(userRepository.addUser(user));
    }
    // adding random user
    public ResponseEntity<User> addUser() {
        return ResponseEntity.ok(userRepository.addUser());

    }
}
