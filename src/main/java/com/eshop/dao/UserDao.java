package com.eshop.dao;

import org.apache.ibatis.annotations.Param;

import com.eshop.po.User;

public interface UserDao {
/*
 * -用户登录
 */
public int userLogin(@Param("loginname") String loginname,@Param("loginpass") String loginpass);
/*
 *- 用户新增
 */
public User addUser(User user);
/*
 * -查询是否存在用户
 */
public int getUserByName(@Param("loginname") String loginname);
}
