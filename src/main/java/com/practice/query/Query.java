package com.practice.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.practice.request.SampleRequest;
import com.practice.response.StudentResponse;
import com.practice.service.StudentService;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	StudentService studentService;

	public String firstQuery() {
		return "FirstQuery";
	}

	public String secondQuery() {
		return "SecondQuery";
	}

	public String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public String fullNameUsingJSON(SampleRequest fullName) {
		return fullName.getFirstName() + " " + fullName.getLastName();
	}

	public StudentResponse student(long id) {
		return new StudentResponse(studentService.getStudentById(id));
	}
}
