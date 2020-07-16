package com.eshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eshop.po.Employee;
import com.eshop.po.User;
import com.eshop.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
//@Resource
	@Autowired
	private UserService userservice;
	@RequestMapping("/login")
	public String getParamByReq(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("uname");
		String password = request.getParameter("upassword");
		//PrintWriter会导致前台界面乱码，需要增加下面两句
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String msg = null;
		PrintWriter out = response.getWriter();
		request.getSession().setAttribute("username", username);// 将用户名保存在整个会话期间,方便页面获取
		System.out.println(username);
		System.out.println(password);
		int u = userservice.userLogin(username, password);
		// int u=0;
		if (u == 0) {
			System.out.println("登录失败，返回首页");
			out.print("<script>alert('登录失败，返回首页')</script>");
			// return "index";
			return "redirect:";
		} else {
			System.out.println("登录成功!");
			out.print("<script language='javascript'>alert('登录成功')</script>");
			// return "query";
			return "../../xadmin/index"; /* X-admin-v2.2/X-admin/index.jsp */
			// return RedirectToAction("about","Home"); ;
		}
	}

	@RequestMapping("/add")
	public String getaddUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String loginname = request.getParameter("uname");
		String loginpass = request.getParameter("upassword");
		String realname = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		//PrintWriter会导致前台界面乱码，需要增加下面两句
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取界面数据输出控制台
		System.out.println(loginname);
		System.out.println(loginpass);
		System.out.println(realname);
		System.out.println(age);
		System.out.println(sex);
		//判断用户是否存在
		int s=userservice.getUserByName(loginname);
		if (s==0) {
		User user=new 	User();
		  user.setLoginname(loginname); 
		  user.setLoginpass(loginpass);
		  user.setRealname(realname);
		  user.setSex(sex); 
		  user.setAge(age);
		  userservice.addUser(user);
		  System.out.println("注册成功");
	  /* if (g!=null) { 
		System.out.println("注册成功");
		  return "login";
		}*/
		  out.print("<script>alert('注册成功')</script>");
		  return "../../login";
	}else{
		 out.print("<script>alert('用户名已存在，请更换')</script>");
		 return "../../regist";
	}}

}
