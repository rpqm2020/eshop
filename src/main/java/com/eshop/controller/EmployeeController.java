package com.eshop.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eshop.po.Employee;
import com.eshop.service.EmployeeService;

	@Controller
	@RequestMapping("/")
	public class EmployeeController {
	    @Autowired
	    private EmployeeService empService;
	    
	    @RequestMapping("/query")
	    public String getList( Model model) {
	        ArrayList<Employee> emp = empService.getList();
	        model.addAttribute("emp", emp);
	        return "query";
	    }
	}

