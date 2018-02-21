package com.spring.jdbc.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee(rs.getInt(1), rs.getString(2),
				rs.getDouble(3));
		return e;
	}

}
