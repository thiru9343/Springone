package com.spring.jdbc.jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"jdbcTemplate.xml");

		EmployeeDao eDao = (EmployeeDao) context.getBean("dao");

		System.out.println("------Records Creation--------");
		eDao.insert(new Employee(24, "George", 75000.00));

		System.out.println("------Listing Multiple Records--------");
		List<Employee> employees = eDao.listEmployees();
		for (Employee record : employees) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Salary : " + record.getSalary());
		}

		System.out.println("----Updating Record with ID = 2 -----");
		eDao.update(24, 124000.00);

		System.out.println("----Listing Record with ID = 2 -----");
		Employee e = eDao.getEmployee(24);
		System.out.print("ID : " + e.getId());
		System.out.print(", Name : " + e.getName());
		System.out.println(", Salary : " + e.getSalary());

		eDao.createTable();

	}
}