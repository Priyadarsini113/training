package com.training.service;

import com.training.model.Course;
import com.training.model.StudentAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.repository.StudentRepository;
import java.util.List;
import java.util.Optional;

@Service
public class StudentManagementService {

    @Autowired
    private StudentRepository studentRepository;



    public StudentAccount createStudentAccount(StudentAccount studentAccount)
    {
      return  studentRepository.save(studentAccount);

    }

    public List<StudentAccount> getAllStudentAccounts()
    {
       return studentRepository.findAll();

    }
    public String deleteStudentAccount(String id)
    {
        studentRepository.deleteById(id);
        return "id deleted :" + id;
    }

    public String updateStudentAccount(String id,StudentAccount studentAccount)
    {
        Optional<StudentAccount> c =studentRepository.findById(id);
        if (c.isEmpty()) {
            return "Student with id: " + id + " not found";
        }

        if (id!=null && studentAccount.getId()!= null  ) {

            if(id != studentAccount.getId())
            return "Invalid student payload, id miss match";
        }

        studentRepository.save(studentAccount);

        return "Student with id: "+id+" updated successfully";

    }

}
