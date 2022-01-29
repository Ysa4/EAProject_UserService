package com.jobSearch.userservice.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.jobSearch.userservice.domain.util.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private Gender gender;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)

    private Address address;


    @OneToOne(cascade = CascadeType.ALL)

    private Account account;
    @OneToMany(cascade = CascadeType.ALL)

    @JoinColumn(name="user_id")


    private List<Experience> experience;
    @OneToMany(cascade = CascadeType.ALL)


    @JoinColumn(name="user_id")
    private List<Education> education;

    public User(){}

    public User(String firstname, String lastname, Gender gender, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        education= new ArrayList<>();
        experience = new ArrayList<>();
    }

    public User(String firstname, String lastname, Gender gender, int age, Address address, Account account, List<Experience> experience, List<Education> education) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.account = account;
        this.experience = experience;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperienceList(List<Experience> experience) {
        this.experience = experience;
    }

    public void setExperience(Experience experience) {
        this.experience.add(experience);
    }
    public void removeExperience(Experience experience) {
        this.experience.remove(experience);
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducationList(List<Education> education) {
        this.education = education;
    }
    public void setEducation(Education education) {
        this.education.add(education);
    }

    public void removeEducation(Education education) {
        this.education.remove(education);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address=" + address +
                ", account=" + account +
                ", experience=" + experience +
                ", education=" + education +
                '}';
    }
}
