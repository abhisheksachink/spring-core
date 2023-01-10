package com.training.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Person person() {
		Person p = new Person(23);
		p.setFirstName("abhi");
		p.setLastName("singh");
		return p;
	}
	@Bean
	public Car car() {
		Car c =new Car();
		c.setMake("HUNDAI");
		c.setModel("MM");
		c.setYear("2022");
		return c;
	}

	@Bean
	public Employee employee() {
		Employee e = new Employee();
		Manager m = new Manager();
		e.setEmpId(101);
		e.setEmpName("abhi");
		e.setSalary(19000);
		return e;
	}
	@Bean
	public Manager manager() {
		Manager m = new Manager();
		m.setName("ramu");
		return m;
	}

}
