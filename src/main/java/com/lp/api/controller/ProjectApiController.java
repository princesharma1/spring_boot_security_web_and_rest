package com.lp.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lp.util.HCache;
import com.lp.web.entity.Project;
import com.lp.web.entity.ProjectProps;
import com.lp.web.service.ProjectService;
import com.lp.web.service.PropService;

@RestController
@RequestMapping("/api/v1/")
public class ProjectApiController {

	@Autowired
	List<ProjectProps> list;
	
	@Autowired
	ProjectService projectService;

	@Autowired
	PropService propService;

	@GetMapping("listprojects")
	public List<Project> getList() {
		List<Project> list = new ArrayList<Project>();
		list = projectService.listProjects();
		return list;
	}

	@GetMapping("view/{id}")
	/*
	 * public Project getById(@PathVariable("id") Long id) { Project p = new
	 * Project(); p = projectService.listProjectById(id); return p; }
	 */
	public List<Project> getById(@PathVariable("id") Long id) {
		List<Project> list = new ArrayList<Project>();
		list = projectService.listProjectfromId(id);
		return list;
	}

	@GetMapping("listprops")
	public List<ProjectProps> listProps() {
		return propService.getList();
	}

	@GetMapping("cacheValues")
	public String getCacheValues() {
		// Map<String,String> map = new HashMap<>();
		String map = HCache.cacheMap.get("confData");
		//List<ProjectProps> l = ApplicationContext.getBean("");
		System.out.println(" ---> " + map);
		return map;
	}
}
