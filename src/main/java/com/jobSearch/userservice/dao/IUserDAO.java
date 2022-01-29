package com.jobSearch.userservice.dao;

import com.jobSearch.userservice.domain.Education;
import com.jobSearch.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDAO extends JpaRepository<User,Long> {
   User findByAccount_UsernameAndAccount_Password(String username,String password);
}
