package com.phegondev.usersmanagementsystem.controller;

import com.phegondev.usersmanagementsystem.entity.TimeSheet;
import com.phegondev.usersmanagementsystem.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timesheets")
public class TimesheetController {
    @Autowired
    private TimesheetService service;

    @GetMapping
    public List<TimeSheet> getAllTimesheets() {
        return service.getAllTimesheets();
    }

    @PostMapping
    public TimeSheet createTimesheet(@RequestBody TimeSheet timesheet) {
        return service.saveTimesheet(timesheet);
    }
}
