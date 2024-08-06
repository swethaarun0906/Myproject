package com.phegondev.usersmanagementsystem.repository;

import com.phegondev.usersmanagementsystem.entity.EmployeeTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTaskRepository extends JpaRepository<EmployeeTask, Long> {
}