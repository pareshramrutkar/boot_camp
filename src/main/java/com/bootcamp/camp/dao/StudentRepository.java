package com.bootcamp.camp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.camp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
