package com.institution.structur.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.institution.structur.institute.Instructor;

public class InstructorNameRowMapper implements RowMapper<Instructor> {

	@Override
	public Instructor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Instructor instructor = new Instructor();
		instructor.setAdmin(rs.getString("admin"));
		instructor.setInstructorName(rs.getString("instructor_Name"));
		return instructor;
	}

}
