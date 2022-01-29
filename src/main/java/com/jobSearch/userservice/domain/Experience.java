package com.jobSearch.userservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Experience {

    @Id
    @GeneratedValue
    private Long id;
    private String jobName;
    private String companyName;
    private String duration;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public Experience(){}
    public Experience(String jobName, String companyName, String duration, Date startDate, Date endDate) {
        this.jobName = jobName;
        this.companyName = companyName;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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
