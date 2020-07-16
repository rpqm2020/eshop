package com.eshop.dao;

import org.apache.ibatis.annotations.Param;

import com.eshop.po.User;

public interface UserDao {
/*
 * -�û���¼
 */
public int userLogin(@Param("loginname") String loginname,@Param("loginpass") String loginpass);
/*
 *- �û�����
 */
public User addUser(User user);
/*
 * -��ѯ�Ƿ�����û�
 */
public int getUserByName(@Param("loginname") String loginname);
}
