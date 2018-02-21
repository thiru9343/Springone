package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.jdbctemplate.Employee;
import com.spring.jdbc.jdbctemplate.EmployeeMapper;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(Employee e) {
		String sql = "INSERT INTO employee(id, name, salary) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSalary());
	}

	public Employee getEmployee(Integer id) {
		String SQL = "select * from employee where id = ?";
		Employee e = jdbcTemplate.queryForObject(SQL, new Object[] { id },
				new EmployeeMapper());
		return e;
	}

	public List<Employee> listEmployees() {
		String SQL = "select * from employee";
		List<Employee> employees = jdbcTemplate
				.query(SQL, new EmployeeMapper());
		return employees;
	}

	public void delete(Integer id) {
		String SQL = "delete from employee where id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
	}

	public void update(Integer id, Double salary) {
		String SQL = "update employee set salary = ? where id = ?";
		jdbcTemplate.update(SQL, salary, id);
		System.out.println("Updated Record with ID = " + id);
	}

	public void createTable() {
		String sql = "create table test1(id integer, value text)";
		jdbcTemplate.execute(sql);
	}
}