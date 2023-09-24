package com.javaweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaweb.entity.role;
import com.javaweb.service.RoleService;

@Controller
public class HomeController {
	@Autowired
	RoleService roleService;
	
	@RequestMapping("home")
	public String home(HttpSession ss,ModelMap model) {
		List<role> roles = roleService.findAll();
		model.addAttribute("role",roles);
		for(role c : roles) {
			System.err.println("hinthui: " + c.getRole_name());
		}
		return "login";
	}

}
