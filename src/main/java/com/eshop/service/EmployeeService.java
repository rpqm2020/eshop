package com.eshop.service;

import java.util.ArrayList;

import com.eshop.po.Employee;

public interface EmployeeService {
	/*
     * -查询所有用户
     */
    public ArrayList<Employee> getList();
}
