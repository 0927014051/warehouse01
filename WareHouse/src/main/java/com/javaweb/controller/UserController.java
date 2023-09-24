package com.javaweb.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.javaweb.entity.staffs;
import com.javaweb.service.impl.StaffServiceImpl;



@Controller
public class UserController {
	
	@Autowired
	StaffServiceImpl staffServiceImpl;
	
	private static staffs staffs;
	
	@RequestMapping("login")
	public String login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			if (session.getAttribute("username") != null && staffs != null && staffs.getRole_id() == 1) {
				return "redirect:/manager/profile";
			} 
		}
		return "login";
	}

	
	public boolean checkLogin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			if (session.getAttribute("username") != null && staffs != null && staffs.getRole_id() == 1) {
				return true;
			}
		}
		return false;
	}
	
	@PostMapping(value = "login/submit")
	public String checklogin(HttpSession ss, HttpServletRequest request, @RequestParam("username") String username,
			@RequestParam("password") String password,  ModelMap model,
			RedirectAttributes ra) {
			staffs = staffServiceImpl.findUserAccount(username);
			if(staffs == null) {
				return "redirect:/login";

			}
			if(username.equals("") || password.equals("")) {
				return "redirect:/login";
			}
			else if(staffs.getEmail().equals(username) && staffs.getPassword().trim().equals(password.trim())) {
				System.err.println("Email is: " + staffs.getEmail());
				System.err.println("Password is: " + staffs.getEmail());
				return "redirect:/manager/profile";

			}
		return "login";

	}
	public static staffs getStaff() {
		return staffs;
	}
	}


