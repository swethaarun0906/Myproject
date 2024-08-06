package com.phegondev.usersmanagementsystem.service;

import com.phegondev.usersmanagementsystem.entity.TimeSheet;
import com.phegondev.usersmanagementsystem.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetService {
    @Autowired
    private TimesheetRepository repository;

    public List<TimeSheet> getAllTimesheets() {
        return repository.findAll();
    }

    public TimeSheet saveTimesheet(TimeSheet timesheet) {
        return repository.save(timesheet);
    }
}
