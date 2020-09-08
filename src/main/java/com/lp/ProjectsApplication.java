package com.lp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lp.web.entity.ProjectProps;
import com.lp.web.repository.PropRepository;

@SpringBootApplication
public class ProjectsApplication {

	@Autowired
	PropRepository propRepository;

	@Bean
	public List<ProjectProps> getAllProps() {
		List<ProjectProps> list = new ArrayList<>();
		list = propRepository.findAll();
		return list;
	}

	@Bean
	InitializingBean sendDatabase() {
		// list = propRepository.findAll();
		// System.out.println("List: " + list);
    
		return () -> {
			propRepository.findAll();
		};
	}

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/projects");

		SpringApplication.run(ProjectsApplication.class, args);
	}

}
