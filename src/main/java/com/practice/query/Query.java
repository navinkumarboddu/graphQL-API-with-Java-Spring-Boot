package com.practice.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.practice.request.SampleRequest;

@Component
public class Query implements GraphQLQueryResolver {

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
}
