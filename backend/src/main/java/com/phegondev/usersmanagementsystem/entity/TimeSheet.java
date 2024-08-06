package com.phegondev.usersmanagementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class TimeSheet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private LocalDate date;
    private int hoursWorked;
    private String taskDescription;


//    @OneToMany(mappedBy = "TimeSheet", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<EmployeeTask> employeeTasks;
    public TimeSheet(){}

    public TimeSheet(Long id, String employeeName, LocalDate date, int hoursWorked, String taskDescription) {
        this.id = id;
        this.employeeName = employeeName;
        this.date = date;
        this.hoursWorked = hoursWorked;
        this.taskDescription = taskDescription;
    }



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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }




}
