package com.example.AC11demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AC11demo.model.Student;

import java.util.List;

@Repository
public interface  StudentRepository extends CrudRepository<Student, Long> {
    // following are custom methods
   Student findByAccountNo (Long accountNo) ;
   List<Student> findByNameContaining(String name);
}
