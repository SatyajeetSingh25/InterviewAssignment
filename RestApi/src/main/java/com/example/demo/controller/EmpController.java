package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/empcontroller")
public class EmpController {

	@Autowired
	private EmpService empService;

	 @GetMapping("employees")
	public List<Employee> getEmployees() {
		return empService.getEmployees();

	}
	 
	 @GetMapping("employee/{id}")
		public List<Employee> getEmployees(@PathVariable int id) {
			return empService.getEmployees();

		}

}
