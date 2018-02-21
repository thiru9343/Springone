package com.spring.jdbc.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Employee e) {
		String sql = "INSERT INTO employee(emp_id, emp_name, emp_salary) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSalary());
	}

	public Employee getEmployee(Integer id) {
		String SQL = "select * from employee where emp_id = ?";
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
		String SQL = "delete from employee where emp_id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
	}

	public void update(Integer id, Double salary) {
		String SQL = "update employee set emp_salary = ? where emp_id = ?";
		jdbcTemplate.update(SQL, salary, id);
		System.out.println("Updated Record with ID = " + id);
	}

	public void createTable() {
		String sql = "create table test1(id integer, value text)";
		jdbcTemplate.execute(sql);
	}
}