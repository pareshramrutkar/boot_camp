package com.bootcamp.camp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.camp.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	
}
