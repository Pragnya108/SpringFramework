package com.createiq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController empcon = applContext.getBean("employeeController", EmployeeController.class);
		Employee emp = new Employee(301,"Pragnya");
		empcon.add(emp);
	}

}
