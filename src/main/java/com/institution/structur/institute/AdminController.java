package com.institution.structur.institute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institution.structur.repo.InstructorRepoForQueries;
import com.institution.structur.repo.InstructorRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	InstructorRepository instructorRepository;

	@Autowired
	InstructorRepoForQueries instructorRepoForQueries;
	
	@GetMapping(value = "/instructor/{admin}", produces = { "application/json" })
	private List<Instructor> getSubOrdinates(@PathVariable("admin") String admin) {
		List<Instructor> subordinates = new ArrayList<>();
		subordinates = instructorRepository.getInstructorById(admin);
		return subordinates;
	}

	@PostMapping(value = "/instructor", consumes= {"application/json"})
	private List<Instructor> getSubOrdinates(@RequestBody Instructor instructor) {
		instructorRepository.save(instructor);
		return null;

	}
}
