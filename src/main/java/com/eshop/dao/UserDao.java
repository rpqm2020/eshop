package com.eshop.dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
/*
 * -�û���¼
 */
public int userLogin(@Param("loginname") String loginname,@Param("loginpass") String loginpass);
}
