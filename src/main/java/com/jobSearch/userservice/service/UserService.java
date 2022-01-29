package com.jobSearch.userservice.service;

import com.jobSearch.userservice.repository.UserRepository;
import com.jobSearch.userservice.util.UserData;
import com.jobSearch.userservice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository iUserDAO;


    @Override
    public List<User> getAllUsers() {
        return iUserDAO.findAll();
    }

    @Override
    public void addUser(User user) {
          iUserDAO.save(user);
    }

    @Override
    public User getUser(Long id) {
        return iUserDAO.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
          iUserDAO.deleteById(id);
    }

    @Override
    public void UpdateUser(User user) {
          iUserDAO.save(user);
    }


    //Education
    @Override
    public List<Education> getUserEducationRecord(Long userId) {
       return iUserDAO.findById(userId).get().getEducation();
    }

    @Override
    public List<Education> addUserSingleEducationRecord(Long userId ,Education educationRecord) {
           User user =this.getUser(userId);
           user.setEducation(educationRecord);
           iUserDAO.save(user);
           return user.getEducation();
    }

    @Override
    public Education getUserSingleEducationRecord(Long userId, Long eduRecordId) {

        List<Education> educationList  =iUserDAO.findById(userId).get().getEducation();
        return educationList.stream()
                .filter(e->e.getId().equals(eduRecordId))
                .findFirst()
                .orElse(null);

    }

    @Override
    public void updateUserSingleEducationRecord(Long userId, Long eduRecordId,Education educationRecord) {
       User user = this.getUser(userId);
        Education education = this.getUserSingleEducationRecord(userId,eduRecordId);
        education.setEducationlevel(educationRecord.getEducationlevel());
        education.setInstitutionName(educationRecord.getInstitutionName());
        education.setEndDate(educationRecord.getEndDate());
        education.setStartDate(education.getStartDate());
        iUserDAO.save(user);
    }

    @Override
    public void deleteUserSingleEducationRecord(Long userId, Long eduRecordId) {
        User user = this.getUser(userId);
        user.removeEducation(this.getUserSingleEducationRecord(userId,eduRecordId));
        iUserDAO.save(user);
    }

    //Experience

    @Override
    public List<Experience> getUserExperienceRecord(Long userId) {
        return iUserDAO.findById(userId).get().getExperience();
    }

    @Override
    public void addUserSingleExperienceRecord(Long userId, Experience experienceRecord) {
        User user =this.getUser(userId);
        user.setExperience(experienceRecord);
        iUserDAO.save(user);
    }

    @Override
    public Experience getUserSingleExperienceRecord(Long userId, Long expRecordId) {
        List<Experience> experienceList  =iUserDAO.findById(userId).get().getExperience();
        return experienceList.stream()
                .filter(e->e.getId().equals(expRecordId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateUserSingleExperienceRecord(Long userId, Long expRecordId, Experience experienceRecord) {
        User user = this.getUser(userId);
        Experience experience = this.getUserSingleExperienceRecord(userId,expRecordId);
        experience.setJobName(experienceRecord.getJobName());
        experience.setDuration(experienceRecord.getDuration());
        experience.setStartDate(experienceRecord.getStartDate());
        experience.setEndDate(experienceRecord.getEndDate());
        experience.setCompanyName(experienceRecord.getCompanyName());
        iUserDAO.save(user);
    }

    @Override
    public void deleteUserSingleExperienceRecord(Long userId, Long expRecordId) {
        User user = this.getUser(userId);
        user.removeExperience(this.getUserSingleExperienceRecord(userId,expRecordId));
        iUserDAO.save(user);
    }

    @Override
    public Long login(Account account) {
        return iUserDAO.findByAccount_UsernameAndAccount_Password(account.getUsername(),account.getPassword()).getId();
    }


@Override
public void signup(UserData user) {
    User newUser = new User();
    newUser.setFirstname(user.getFirstname());
    newUser.setLastname(user.getFirstname());
    newUser.setGender(user.getGender());
    newUser.setAge(user.getAge());
    newUser.setAddress(user.getAddress());
    newUser.setAccount(user.getAccount());

    newUser.setEducationList(user.getEducation());

    newUser.setExperienceList(user.getExperience());

    iUserDAO.save(newUser);
}
}
