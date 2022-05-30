package com.Jolt.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2, message="must be greater than two characters")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
