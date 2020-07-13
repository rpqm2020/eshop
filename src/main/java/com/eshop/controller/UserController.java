package com.eshop.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eshop.service.UserService;
@Controller
@RequestMapping("/")
public class UserController {
//@Resource
@Autowired
private UserService userservice;
@RequestMapping("/login")
public String getParamByReq(HttpServletRequest request, HttpServletResponse response) {
	String username = request.getParameter("uname");
	String password = request.getParameter("upassword");

    request.getSession().setAttribute("username",username);//将用户名保存在整个会话期间
	System.out.println(username);
	System.out.println(password);
	 int u=userservice.userLogin(username,password);
	//int u=0;
	    if(u==0) {
	    	System.out.println("登录失败，返回首页");
	    //	return "index";
	    	return "redirect:"; 	
	    }else{
	    System.out.println("登录成功!");
	    //return "query";
			return "../../xadmin/index"; /* X-admin-v2.2/X-admin/index.jsp */
	    //return RedirectToAction("about","Home"); ;
	    }
}	

}
