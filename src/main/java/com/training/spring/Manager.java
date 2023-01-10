package com.training.spring;

public class Manager {
	private String name;
	private double sal;
	
	private Employee empl;
	
	public Employee getEmpl() {
		return empl;
	}
	public void setEmpl(Employee empl) {
		this.empl = empl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	public String emplDetail() {
		return "Employee id "+empl.getEmpId();
	}
}
