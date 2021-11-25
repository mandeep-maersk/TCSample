package com.institution.structur.institute;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.Query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Instructor {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@JsonIgnore
	private long id;

	@JsonProperty("instructorName")
	public String instructorName;
	
	@JsonProperty("admin")
	public String admin;

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

}
