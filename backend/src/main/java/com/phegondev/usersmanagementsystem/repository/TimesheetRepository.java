package com.phegondev.usersmanagementsystem.repository;

import com.phegondev.usersmanagementsystem.entity.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepository extends JpaRepository<TimeSheet, Long> {
}

