package com.newer.student_demo.repo;

import com.newer.student_demo.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<StudentEntity,Integer> {
}
