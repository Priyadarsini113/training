package com.training.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.training.model.StudentAccount;

@Repository
public interface StudentRepository extends JpaRepository<StudentAccount,String>{

}