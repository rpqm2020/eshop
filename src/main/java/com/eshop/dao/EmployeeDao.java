package com.eshop.dao;

import java.util.ArrayList;

import com.eshop.po.Employee;



public interface EmployeeDao {
	/*
     * -查询所有用户
     */
    public ArrayList<Employee> getList();
}
