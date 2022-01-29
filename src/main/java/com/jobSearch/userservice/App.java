package com.jobSearch.userservice;

import com.jobSearch.userservice.domain.*;
import com.jobSearch.userservice.domain.util.EducationLevel;
import com.jobSearch.userservice.domain.util.Gender;
import com.jobSearch.userservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

 SpringApplication.run(App.class, args);

    }

    @Bean
    public CommandLineRunner insertData(UserRepository iUserDAO)
    {
         return  args->{
             User user1 = new User("John","Doe", Gender.MALE,25);
             Address address = new Address("Fairfield","IA","52557","+123456789","jDoe@gmail.com");
             Experience experience = new Experience("Software Developer","Google","2 Year",new Date("01/01/2020"),new Date("01/01/2022"));
             Education education = new Education("MIT", EducationLevel.DEGREE,new Date("01/01/2016"),new Date("01/01/2019"));
             Education education1 = new Education("Stanford", EducationLevel.MASTERS,new Date("01/01/2020"),new Date("01/01/2022"));
             Account account = new Account("yeab","sira");
             user1.setAddress(address);
             user1.setExperience(experience);
             user1.setEducation(education);
             user1.setEducation(education1);
             user1.setAccount(account);

             iUserDAO.save(user1);


             User user2 = new User("Jane","Doe", Gender.FEMALE,25);
             Address address2 = new Address("Fairfield","IA","52557","+123456789","jDoe@gmail.com");
             Experience experience2 = new Experience("Software Developer","Twitter","1 Year",new Date("01/01/2020"),new Date("01/01/2021"));
             Experience experience21 = new Experience("Software Developer","Microsoft","1 Year",new Date("01/01/2021"),new Date("01/01/2022"));
             Education education21 = new Education("MIT", EducationLevel.DEGREE,new Date("01/01/2016"),new Date("01/01/2019"));
             Account account1 = new Account("sira","yeab");
             user2.setAddress(address2);
             user2.setExperience(experience2);
             user2.setExperience(experience21);
             user2.setEducation(education21);
             user2.setAccount(account1);

             iUserDAO.save(user2);



         };
    }
}
