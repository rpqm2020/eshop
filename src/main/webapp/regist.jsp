<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>系统注册</title>
<link rel="stylesheet" href="<%=basePath %>/css/login.css"> 
<link rel="stylesheet" href="<%=basePath %>/font-awesome-4.7.0/css/font-awesome.css">
</head>
<body>
<!-- <form action="add" method="post">
    账号：<input type="text"   name="uname">

    密码：<input type="password" name="upassword">
  真实姓名：<input type="text"   name="username">

  年龄：<input type="text" name="age">
   性别：<input type="text" name="sex">
    <input type="submit" value="注册">
</form> -->
<form method="post" action="add">
    <div id="login-box">
        <h1>小叮当家二手交易平台</h1>
        <div class="form">
            <div class="item">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <input type="text" placeholder="请输入用户名" name="uname">
            </div>
            <div class="item">
                  <i class="fa fa-key" aria-hidden="true"></i>
                  <input type="password" placeholder="请输入密码" name="upassword">
            </div>
            <div class="item">
                  <i class="fa fa-user" aria-hidden="true"></i>
                  <input type="text" placeholder="请输入真实姓名" name="username">
            </div>
            <div class="item">
                  <i class="fa fa-circle" aria-hidden="true"></i>
                  <input type="text" placeholder="请输入年龄" name="age">
            </div>
            <div class="item">
                  <i class="fa fa-code" aria-hidden="true"></i>
                  <input type="text" placeholder="请输入性别" name="sex">
            </div>
        </div>
        <button type="submit">注册</button>
    </div> 
</form>
</body>
</html>