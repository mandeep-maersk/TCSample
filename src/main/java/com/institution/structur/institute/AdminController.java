package com.institution.structur.institute;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institution.structur.repo.InstructorRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	InstructorRepository instructorRepository;

	@GetMapping(value = "/instructor/{instructorName}", produces = { "application/json" })
	private List<Instructor> getSubOrdinates(@PathVariable("instructorName") String instructorName) {
		List<Instructor> subordinates = new ArrayList<>();
		subordinates = instructorRepository.getInstructorById(instructorName);
		return subordinates;
	}

	@PostMapping(value = "/instructor/{adminId}", consumes= {"application/json"})
	private List<Instructor> getSubOrdinates(@RequestBody Instructor instructor, @PathVariable("adminId") String adminId) {
		instructorRepository.save(instructor);
		return null;

	}
}
