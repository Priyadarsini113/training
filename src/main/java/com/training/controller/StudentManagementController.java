package com.training.controller;

import com.training.model.StudentAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.training.service.StudentManagementService;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentManagementController {
    @Autowired
    private StudentManagementService studentManagementService;


    @PostMapping(value="/students")
    public StudentAccount createStudentAccount(@RequestBody StudentAccount studentAccount){
       return studentManagementService.createStudentAccount(studentAccount);
    }

    @GetMapping(value="/students")
    public List<StudentAccount> getAllStudentAccounts()
    {
        return studentManagementService.getAllStudentAccounts();
    }

    @DeleteMapping(value="/students/{id}")
    public String deleteStudentAccount(@PathVariable String id)
    {

        return studentManagementService.deleteStudentAccount(id);
    }

    @PutMapping(value="/students/{id}")
    public String updateStudentAccount(@PathVariable String id,@RequestBody StudentAccount studentAccount)
    {
        return studentManagementService.updateStudentAccount(id,studentAccount);
    }

}
