package com.createiq.service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO empldao;
	
	public EmployeeServiceImpl() {	}
	
	

	public void setEmpldao(EmployeeDAO empldao) {
		this.empldao = empldao;
	}



	public void add(Employee emp) {
		System.out.println("EmployeeServiceImpl add method.."+emp);
		empldao.add(emp);
	}

}
