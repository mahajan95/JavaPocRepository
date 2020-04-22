package com.solution.com.ReadingPropFile.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.solution.com.ReadingPropFile.repository.UserInterface;

public class UserProfile implements UserInterface {

	@Value("${userfirst.name}")
	private String name;
	
	@Value("${user.email}")
	private String email;
	
	public UserProfile() {
		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	

	
	
	
	
}
