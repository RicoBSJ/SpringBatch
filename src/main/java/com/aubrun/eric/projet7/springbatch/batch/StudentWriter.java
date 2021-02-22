package com.aubrun.eric.projet7.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.aubrun.eric.projet7.springbatch.model.Student;
import com.aubrun.eric.projet7.springbatch.service.IStudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentWriter implements ItemWriter<Student> {

    @Autowired
    private IStudentService studentService;

    @Override
    public void write(List<? extends Student> students) {
        students.forEach(student -> {
            log.info("Enregistrement en base de l'objet {}", student);
            studentService.insertStudent(student);
        });
    }
}