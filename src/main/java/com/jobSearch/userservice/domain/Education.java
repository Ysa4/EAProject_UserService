package com.jobSearch.userservice.domain;

import com.jobSearch.userservice.domain.util.EducationLevel;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Education {


    @Id
    @GeneratedValue
    private Long id;
    private String institutionName;
    private EducationLevel educationlevel;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    public Education(){}
    public Education(String institutionName, EducationLevel educationlevel, Date startDate, Date endDate) {
        this.institutionName = institutionName;
        this.educationlevel = educationlevel;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public EducationLevel getEducationlevel() {
        return educationlevel;
    }

    public void setEducationlevel(EducationLevel educationlevel) {
        this.educationlevel = educationlevel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}