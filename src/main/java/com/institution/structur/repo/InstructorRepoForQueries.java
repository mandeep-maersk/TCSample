package com.institution.structur.repo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorRepoForQueries {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> getInstructorById(String instructorName) {

		SqlParameterSource parameters = new MapSqlParameterSource("instructorName", instructorName);
		List<Map<String, Object>> instructorList = jdbcTemplate.queryForList("select * from instructor  where instructor_Name= ?", new Object[]{instructorName},
				new InstructorNameRowMapper());
		return instructorList;
	}
}