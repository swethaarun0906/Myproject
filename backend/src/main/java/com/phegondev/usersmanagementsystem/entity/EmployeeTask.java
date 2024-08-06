package com.phegondev.usersmanagementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class EmployeeTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employeeName;
    private String task;
    private String activity;
    private int mon;
    private int tue;
    private int wed;
    private int thu;
    private int fri;
    private int sat;
    private int total;
    private String progress;
    private LocalDate date;
    private Date startDate;
    private Date endDate;

    // Establishing a many-to-one relationship with OurUsers
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private OurUsers ourUsers;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getTue() {
        return tue;
    }

    public void setTue(int tue) {
        this.tue = tue;
    }

    public int getWed() {
        return wed;
    }

    public void setWed(int wed) {
        this.wed = wed;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public int getFri() {
        return fri;
    }

    public void setFri(int fri) {
        this.fri = fri;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public OurUsers getOurUsers() {
        return ourUsers;
    }

    public void setOurUsers(OurUsers ourUsers) {
        this.ourUsers = ourUsers;
    }
}
