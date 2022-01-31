package com.jobSearch.userservice.controller;


import com.jobSearch.userservice.dto.UserData;
import com.jobSearch.userservice.domain.*;
import com.jobSearch.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
         return  service.getAllUsers();
    }
    @PostMapping("/users")
    public void signup(@RequestBody UserData userData)  {

     service.signup(userData);

    }



    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id)
    {

        return  service.getUser(id);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@PathVariable long id, @RequestBody User user)
    {
         service.UpdateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        service.deleteUser(id);
    }

    //education

    @GetMapping("/users/{id}/edu/")
    public List<Education> getUserAllEducationRecord(@PathVariable Long id)
    {

        return service.getUserEducationRecord(id);
    }

    @GetMapping("/users/{uid}/edu/{eid}")
    public Education getUserEducationRecord(@PathVariable Long uid,@PathVariable Long eid)
    {
       return  service.getUserSingleEducationRecord(uid,eid);
    }

    @PostMapping("/users/{uid}/edu/")
    public List<Education> getUserEducationRecord(@PathVariable Long uid, @RequestBody Education education)
    {
        return service.addUserSingleEducationRecord(uid ,education);
    }

    @PutMapping("/users/{uid}/edu/{eid}")
    public void updateUserEducationRecord(@PathVariable Long uid,@PathVariable Long eid,@RequestBody Education education)
    {
        service.updateUserSingleEducationRecord(uid ,eid,education);
    }
    @DeleteMapping("/users/{uid}/edu/{eid}")
    public void deleteUserEducationRecord(@PathVariable Long uid,@PathVariable Long eid)
    {
        service.deleteUserSingleEducationRecord(uid,eid);
    }


    //Experience

    @GetMapping("/users/{id}/exp/")
    public List<Experience> getUserAllExperienceRecord(@PathVariable Long id)
    {

        return service.getUserExperienceRecord(id);
    }

    @GetMapping("/users/{uid}/exp/{eid}")
    public Experience getUserExperienceRecord(@PathVariable Long uid,@PathVariable Long eid)
    {
        return  service.getUserSingleExperienceRecord(uid,eid);
    }

    @PostMapping("/users/{uid}/exp/")
    public void getUserEducationRecord(@PathVariable Long uid,@RequestBody Experience experience)
    {
        service.addUserSingleExperienceRecord(uid ,experience);
    }

    @PutMapping("/users/{uid}/exp/{eid}")
    public void updateUserExperienceRecord(@PathVariable Long uid,@PathVariable Long eid,@RequestBody Experience experience)
    {
        service.updateUserSingleExperienceRecord(uid ,eid,experience);
    }
    @DeleteMapping("/users/{uid}/exp/{eid}")
    public void deleteUserExperienceRecord(@PathVariable Long uid,@PathVariable Long eid)
    {
        service.deleteUserSingleExperienceRecord(uid,eid);
    }




}
