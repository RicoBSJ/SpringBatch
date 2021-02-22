package com.aubrun.eric.projet7.springbatch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aubrun.eric.projet7.springbatch.model.Student;
import com.aubrun.eric.projet7.springbatch.repository.IStudentRepository;
import com.aubrun.eric.projet7.springbatch.service.IStudentService;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }
}