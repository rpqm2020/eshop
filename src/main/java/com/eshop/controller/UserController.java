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
//@ResponseBody ���ַ�������ҳ��
@RequestMapping("/")
public class UserController {
//@Resource
@Autowired
private UserService userservice;
@RequestMapping("/login")
public String getParamByReq(HttpServletRequest request, HttpServletResponse response) {
	String username = request.getParameter("uname");
	String password = request.getParameter("upassword");
	System.out.println(username);
	System.out.println(password);
	 int u=userservice.userLogin(username,password);
	//int u=0;
	    if(u==0) {
	    	System.out.println("��¼ʧ�ܣ�������ҳ");
	    //	return "index";
	    	return "redirect:"; 	
	    }else{
	    System.out.println("��¼�ɹ�");
	    //return "query";
	    return "redirect:query"; 	
	    //return RedirectToAction("about","Home"); ;
	    }
}	

}