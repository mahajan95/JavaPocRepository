package com.solution.com.ReadingPropFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.solution.com.ReadingPropFile.repository.UserInterface;
import com.solution.com.ReadingPropFile.user.UserConfig;
import com.solution.com.ReadingPropFile.user.UserProfile;

@SpringBootApplication
public class ReadingPropFileApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ReadingPropFileApplication.class, args);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
			UserProfile test=context.getBean("userBeansetup",UserProfile.class);
		System.out.println(test.getName());
		System.out.println(test.getEmail());
		
		
	}

	
}
