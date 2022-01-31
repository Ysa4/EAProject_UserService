package com.jobSearch.userservice.service;

import com.jobSearch.userservice.dto.UserData;
import com.jobSearch.userservice.domain.*;

import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public void addUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void UpdateUser(User user);

    // education
    public List<Education>  getUserEducationRecord(Long userId);
    public List<Education> addUserSingleEducationRecord(Long userId ,Education educationRecord);
    public Education getUserSingleEducationRecord(Long userId,Long eduRecordId);
    public void updateUserSingleEducationRecord(Long userId,Long eduRecordId,Education educationRecord);
    public void deleteUserSingleEducationRecord(Long userId,Long eduRecordId);

    //experience
    public List<Experience>  getUserExperienceRecord(Long userId);
    public void addUserSingleExperienceRecord(Long userId ,Experience experienceRecord);
    public Experience getUserSingleExperienceRecord(Long userId,Long expRecordId);
    public void updateUserSingleExperienceRecord(Long userId,Long expRecordId,Experience experienceRecord);
    public void deleteUserSingleExperienceRecord(Long userId,Long expRecordId);

    // account

    public Long login(Account account);
    public void signup(UserData user);
}
