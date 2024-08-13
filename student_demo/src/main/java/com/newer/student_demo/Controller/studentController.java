package com.newer.student_demo.Controller;

import com.newer.student_demo.Entity.StudentEntity;
import com.newer.student_demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    public studentService service;


    @GetMapping("/getStudents")
    public List<StudentEntity> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/getStudents/{id}")
    public StudentEntity getStudentsbyId(@PathVariable int id){
        return service.getStudentsbyId(id);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentEntity student){
        service.addStudent(student);
        return "Succesfully Added";
    }

    @DeleteMapping("/removeStudent")
    public String removeStudent(@RequestBody StudentEntity student){
        service.removeStudent(student);
        return "Successfully Deleted";
    }

    @PutMapping("/updateStudent/{id}")
    public StudentEntity updateStudentName(@PathVariable int id , @RequestParam String name ){
        return service.updateStudent(id, name);
    }
}
