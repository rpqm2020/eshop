package com.eshop.dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
/*
 * -ÓÃ»§µÇÂ¼
 */
public int userLogin(@Param("loginname") String loginname,@Param("loginpass") String loginpass);
}
