package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstSpringController {

	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
	public String firstMethod(ModelMap model, @PathVariable Integer id,
			@RequestParam String name) {
		model.addAttribute("message",
				"This is a class on Batch 99 Spring Framework Hi, " + name
						+ "(" + id + ")");
		return "hello";
	}
	// /pages/hello.jsp
}