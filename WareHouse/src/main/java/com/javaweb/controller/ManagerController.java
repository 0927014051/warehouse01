package com.javaweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("manager")
public class ManagerController {
	
	@RequestMapping("/nv")
	public String manager_nv() {
		return "manager_nv";
	}
	
	@RequestMapping("profile")
	public String profileStaff(HttpSession ss,ModelMap model) {
		System.err.println("hien thi" + UserController.getStaff().getEmail());
		model.addAttribute("staffs",UserController.getStaff());
		return "profile";
	}
}
