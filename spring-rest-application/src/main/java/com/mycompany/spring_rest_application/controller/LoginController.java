package com.mycompany.spring_rest_application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.spring_rest_application.model.User;
import com.mycompany.spring_rest_application.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String getLoginForm(Model model) {
		/* model.addAttribute("user", new User()); */
		return "login-user";
	}
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String checkLoginDetails(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		int status = loginService.validateUser(userName, password);
		if(status == 0) {
			return "welcome-page";
		}
		else {
			return "login-user";
		}
	}
}
