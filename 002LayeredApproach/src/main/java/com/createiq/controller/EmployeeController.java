package com.createiq.controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

public class EmployeeController {
	private EmployeeService emplSer;

	public EmployeeController(EmployeeService emplSer) {
		this.emplSer = emplSer;
	}
	
	public void add(Employee emp) {
		System.out.println("EmployeeController add method.."+emp);
		emplSer.add(emp);
	}
}
