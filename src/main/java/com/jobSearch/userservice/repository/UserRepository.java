package com.jobSearch.userservice.repository;

import com.jobSearch.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   User findByAccount_UsernameAndAccount_Password(String username,String password);
}
