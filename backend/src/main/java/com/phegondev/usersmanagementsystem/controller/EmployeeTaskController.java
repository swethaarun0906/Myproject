package com.phegondev.usersmanagementsystem.controller;

import com.phegondev.usersmanagementsystem.entity.EmployeeTask;
import com.phegondev.usersmanagementsystem.repository.EmployeeTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*")
public class EmployeeTaskController {

    @Autowired
    private EmployeeTaskRepository repository;

    @GetMapping
    public List<EmployeeTask> getAllTasks() {
        return repository.findAll();
    }

    @PostMapping
    public EmployeeTask createTask(@RequestBody EmployeeTask task) {
        task.setTotal(task.getMon() + task.getTue() + task.getWed() + task.getThu() + task.getFri() + task.getSat());
        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllTasks() {
        repository.deleteAll();
    }

    @PostMapping("/{id}/dates")
    public EmployeeTask setDatesForTask(
            @PathVariable Long id,
            @RequestParam Date startDate,
            @RequestParam Date endDate) {
        EmployeeTask task = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));

        task.setStartDate(startDate);
        task.setEndDate(endDate);

        return repository.save(task);
    }
}