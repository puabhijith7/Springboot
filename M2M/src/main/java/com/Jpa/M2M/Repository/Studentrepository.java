package com.Jpa.M2M.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jpa.M2M.Entity.Course;
import com.Jpa.M2M.Entity.Student;

public interface Studentrepository extends JpaRepository <Student,Long>{

}
