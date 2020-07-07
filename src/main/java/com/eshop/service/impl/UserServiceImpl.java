package com.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.dao.UserDao;
import com.eshop.service.UserService;
@Service
@Transactional //��������
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userdao;
	public int userLogin(String loginname, String loginpass) {
		// TODO Auto-generated method stub
		return this.userdao.userLogin(loginname,loginpass);//
	}

}
