package com.jobSearch.userservice.dto;


import com.jobSearch.userservice.domain.Account;
import com.jobSearch.userservice.domain.Address;
import com.jobSearch.userservice.domain.Education;
import com.jobSearch.userservice.domain.Experience;
import com.jobSearch.userservice.domain.util.Gender;

import java.util.List;

public class UserData {

    private String firstname;
    private String lastname;
    private Gender gender;
    private int age;
    private Address address;
    private Account account;
    private List<Experience> experience;
    private List<Education> education;

    public UserData(String firstname, String lastname, Gender gender, int age, Address address, Account account, List<Experience> experience, List<Education> education) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.account = account;
        this.experience = experience;
        this.education = education;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }
}
