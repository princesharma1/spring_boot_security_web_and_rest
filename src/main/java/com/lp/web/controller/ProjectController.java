package com.lp.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lp.web.entity.Project;
import com.lp.web.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;

	/*
	 * @Autowired Authentication auth;
	 */
	
	@GetMapping("/")
	public String index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String uname = auth.getName();
		model.addAttribute("msg", uname+" Hello World! ");
		return "index";
	}

	//@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView loginPage() {
	    return new ModelAndView("l");
	}

	//@PostMapping("/login_auth")
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login_auth(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("l");

		return model;
	}

	@GetMapping("/listprojects")
	public ModelAndView listPage() {
		ModelAndView model = new ModelAndView("list-projects");
		List<Project> list = new ArrayList<>();
		list = projectService.listProjects();
		model.addObject("list", list);
		return model;

	}

	@GetMapping("/view/{id}")
	public ModelAndView viewPage(@PathVariable("id") Long id) {
		ModelAndView model = new ModelAndView("list-projectbyId");
		Project p = new Project();
		p = projectService.listProjectById(id);
		model.addObject("p", p);
		return model;

	}
}
