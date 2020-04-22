package com.solution.com.ReadingPropFile.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.solution.com.ReadingPropFile.repository.UserInterface;

@Configuration
@PropertySource("classpath:user.properties")
@ComponentScan("com.solution.com.ReadingPropFile.repository")
public class UserConfig {

	
	@Bean
	public UserInterface userBeansetup() {
		UserProfile t =new UserProfile();
	   return t;
	}

	
}
