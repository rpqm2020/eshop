package com.eshop.service;

import org.apache.ibatis.annotations.Param;

import com.eshop.po.User;

public interface UserService {
	/*
	 * -�û���¼
	 */
	public int userLogin(String loginname,String loginpass);
	/*
	 *- �û�����
	 */
	public User addUser(User user);
	/*
	 * -��ѯ�Ƿ�����û�
	 */
	public int getUserByName(String loginname);
}
