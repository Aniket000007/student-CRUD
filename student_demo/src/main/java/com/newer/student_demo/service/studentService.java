package com.newer.student_demo.service;

import com.newer.student_demo.Entity.StudentEntity;
import com.newer.student_demo.repo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    public studentRepo repo;


    public List<StudentEntity> getStudents(){
        return repo.findAll();
    }

    public void addStudent(StudentEntity student) {
        repo.save(student);
    }

    public StudentEntity getStudentsbyId(int id) {
        StudentEntity student = repo.findById(id).get();
        return student;
    }

    public void removeStudent(StudentEntity student) {
        repo.delete(student);
    }


    public StudentEntity updateStudent(int id , String name) {
        StudentEntity studentOld = repo.findById(id).get();
        studentOld.setName(name);
        repo.save(studentOld);
        return studentOld;
    }
}
