package com.ettayebchikhi.backendpart.service;

import com.ettayebchikhi.backendpart.models.AppUser;
import com.ettayebchikhi.backendpart.repository.UserRepository;
import com.ettayebchikhi.backendpart.utils.CsvDataAccess;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CsvDataAccess csvDataAccess;
    public ResponseEntity<List<AppUser>> getUsers() {
        try{
            List<AppUser> users = userRepository.findAll();
            if(users.size()==0){
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(users);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    public ResponseEntity<AppUser> addUser(AppUser user) {
        try{
            userRepository.save(user);
            return ResponseEntity.ok(user);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
    // adding random user
    public ResponseEntity<AppUser> addUser() {
        try{
            AppUser user = csvDataAccess.getRandomRecord();
            userRepository.save(user);
            return ResponseEntity.ok(user);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }

    }
}
