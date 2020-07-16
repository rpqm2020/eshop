package com.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.dao.UserDao;
import com.eshop.po.User;
import com.eshop.service.UserService;
@Service
@Transactional //¿ªÆôÊÂÎñ
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userdao;
	public int userLogin(String loginname, String loginpass) {
		// TODO Auto-generated method stub
		return this.userdao.userLogin(loginname,loginpass);//
	}
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userdao.addUser(user);
	}
	public int getUserByName(String loginname) {
		// TODO Auto-generated method stub
		return this.userdao.getUserByName(loginname);
	}

}
