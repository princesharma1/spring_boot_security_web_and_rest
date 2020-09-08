package com.lp.web.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.util.HCache;
import com.lp.web.entity.Project;

import com.lp.web.repository.ProjectRepository;


@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;


	public List<Project> listProjects() {
		if (HCache.cacheMap.get("myData") == null) {
			System.out.println("---> Before data ..." + HCache.cacheMap.get("myData"));
			HCache.cacheMap.put("myData", "Hello World !!!! ");
			System.out.println("---> Put data in cache...");
		} else {
			System.out.println(HCache.cacheMap.get("myData"));
			System.out.println(" Data After cache: ");
		}
		return projectRepository.findAll();
	}

	public List<Project> listProjectfromId(Long id) {
		return projectRepository.findDataById(id);
	}

	public Project listProjectById(Long id) {
		return projectRepository.getOne(id);
	}

	

}
