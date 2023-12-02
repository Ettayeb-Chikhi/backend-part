package com.ettayebchikhi.backendpart.utils;

import com.ettayebchikhi.backendpart.models.User;

import java.util.List;

public interface DataAccess {
    User addRecord(User user);
    User addRandomRecord();
    List<User> getRecords();
}
