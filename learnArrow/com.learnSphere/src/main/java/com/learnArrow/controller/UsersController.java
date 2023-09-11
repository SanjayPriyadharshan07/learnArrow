package com.learnArrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnArrow.entities.Users;
import com.learnArrow.services.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController {
	@Autowired
	UsersService uservice;
@PostMapping("/addUser")
public String addUser(@ModelAttribute Users user) {
	uservice.addUser(user);
	String email = user.getEmail();
	boolean isPresent =uservice.checkEmail(email);
	if(isPresent == false) {
		uservice.addUser(user);
	}
	else {
		System.out.println("email already present");
	}
	return "login";
}
@PostMapping("/validateUser")
public String validateUser(@RequestParam("email")String email, 
		@RequestParam("password")String password, HttpSession session) {
	Users user = uservice.findUserByEmail(email);
	String dbpassword = user.getPassword();
	String role = user.getRole();
	if (password.equals(dbpassword)) {
		session.setAttribute("loggedInUser",user);
		if(role.equals("trainer")) {
			return "trainerHome";
		}
		else {
			return "studentHome";
		}
	}
		return "login";
}

}
