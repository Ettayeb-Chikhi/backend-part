package com.ettayebchikhi.backendpart.utils;

import com.ettayebchikhi.backendpart.models.AppUser;

import java.util.List;

public interface DataAccess {

    List<AppUser> getRecords();
}
