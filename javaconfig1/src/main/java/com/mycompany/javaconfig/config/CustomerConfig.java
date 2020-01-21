package com.mycompany.javaconfig.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.mycompany.javaconfig1")
public class CustomerConfig {

	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource();

	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource());
	}
}
