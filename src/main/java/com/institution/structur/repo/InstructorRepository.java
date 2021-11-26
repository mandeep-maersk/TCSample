package com.institution.structur.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.institution.structur.institute.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

	@Query(value = "SELECT * FROM INSTRUCTOR WHERE admin= :admin", nativeQuery = true)
	List<Instructor> getInstructorById(@Param("admin") String admin);
}