package com.ettayebchikhi.backendpart.repository;

import com.ettayebchikhi.backendpart.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Long> {

}
