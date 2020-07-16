package com.eshop.service;

import org.apache.ibatis.annotations.Param;

import com.eshop.po.User;

public interface UserService {
	/*
	 * -用户登录
	 */
	public int userLogin(String loginname,String loginpass);
	/*
	 *- 用户新增
	 */
	public User addUser(User user);
	/*
	 * -查询是否存在用户
	 */
	public int getUserByName(String loginname);
}
