package com.institution.structur.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.institution.structur.institute.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
	
	@Query(value="select * from instructor where instructor_Name=?1")
	public List<Instructor> getInstructorById(String instructorName);
}