package com.esoft.spring.jdbc.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AbstractJdbcTemplate {
	
	private DataSource datasource;
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	
}
