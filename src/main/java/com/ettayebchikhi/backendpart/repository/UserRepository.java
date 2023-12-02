package com.ettayebchikhi.backendpart.repository;

import com.ettayebchikhi.backendpart.models.User;
import com.ettayebchikhi.backendpart.utils.CsvDataAccess;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserRepository {
    private final CsvDataAccess csvDataAccess;
    public List<User> getAllUsers(){
        return csvDataAccess.getRecords();
    }

    public User addUser(User user) {
        return csvDataAccess.addRecord(user);
    }

    public User addUser() {
        return csvDataAccess.addRandomRecord();
    }
}
