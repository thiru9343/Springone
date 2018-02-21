package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jdbc.jdbctemplate.Employee;

@Controller
public class HomeController {
	@Autowired
	private EmployeeDao dao;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(ModelMap model) {
		List<Employee> employees = dao.listEmployees();
		return new ModelAndView("home", "employees", employees);
	}
}
