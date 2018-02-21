package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(ModelMap map) {
		return new ModelAndView("login", "cred", new Credential());
	}

	@RequestMapping(value = "/authorize", method = RequestMethod.POST)
	public String authorize(@ModelAttribute Credential c, HttpSession s,
			HttpServletRequest request) {
		if ("admin".equals(c.getUsername()) && "secret".equals(c.getPassword())) {
			return "redirect:home.do"; // /pages/home.do.jsp
		}

		return "unauthorized";
	}
	
	public static void main(String[] args) {
		System.out.println(String.format("%010d","12"));
	}
}
