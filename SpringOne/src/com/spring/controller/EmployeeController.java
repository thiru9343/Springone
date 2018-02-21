package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jdbc.jdbctemplate.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

	// employee.do
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView loadEmployeePage(ModelMap map) {
		return new ModelAndView("employee", "emp", new Employee());
	}

	// /pages/employee.jsp
	@RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
	public String save(@ModelAttribute Employee e, HttpSession s,
			HttpServletRequest request) {
		dao.insert(e);
		return "success";
	}
}
