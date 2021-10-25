package com.intellibyte.smartcontacts.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserModel {
	
	private String username;
	@NotNull(message="First name cannot be empty")
	@Size(min=2,max=30, message="First name should be between 2-30 characters")
	private String firstName;
	@NotNull(message="Last name cannot be empty")
	@Size(min=2,max=30, message="Last name should be between 2-30 characters")
	private String lastName;
	@NotNull(message="Email cannot be empty")
	@Email
	private String email;
	@NotNull(message="pl enter a password to continue")
	@Size(min=8,max=16, message="Password should be between 2-30 characters")
	private String password;
	private String profImage;
	
	public UserModel(String username, String firstName, String lastName, String email, String password,
			String profImage) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.profImage = profImage;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfImage() {
		return profImage;
	}

	public void setProfImage(String profImage) {
		this.profImage = profImage;
	}
	
	
	
}
