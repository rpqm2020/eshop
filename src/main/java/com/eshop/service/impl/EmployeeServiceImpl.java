package com.eshop.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.dao.EmployeeDao;
import com.eshop.po.Employee;
import com.eshop.service.EmployeeService;
@Service
@Transactional //¿ªÆôÊÂÎñ
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao empDao;
	public ArrayList<Employee> getList() {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.addAll(this.empDao.getList());
		return ar;
	}

}
