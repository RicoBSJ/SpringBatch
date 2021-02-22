package com.aubrun.eric.projet7.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aubrun.eric.projet7.springbatch.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
}