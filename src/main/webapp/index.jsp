<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>系统首页</title>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<link rel="stylesheet" href="${path}/css/login.css">
<link rel="stylesheet" href="${path}/font-awesome-4.7.0/css/font-awesome.css">
<style type="text/css">
#login-box{
    width: 30%;
    height: auto;
    margin: 0 auto;
    margin-top: 10%;
    text-align: center;
    background: #00000080;
    padding: 20px 50px;
}

#login-box h1{
    color: #ffcccc;
}

#login-box .form{
    margin-top: 50px;
}

#login-box .form i{
    font-size: 18px;
    color: #ffffff;
}

#login-box .form .item{
    margin-top: 15px;
}

#login-box .form .item input{
    width: 180px;
    font-size: 18px;
    border: 1;
    /* border-bottom: 2px solid #ffffff; */
    padding: 5px 10px;
    background: #ffffff;
}

#login-box button{
    margin-top: 15px;
    width: 180px;
    height: 30px;
    font-size: 20px;
    font-weight: 700;
    border: 0;
    background-image: linear-gradient(to right, #b8cbb8 0%, #b8cbb8 0%, #ddbaee 0%, #e8a8ee 33%, #b8d9f8 66%, #59bcf5 100%);
    border-radius: 15px;
}

body {
    background:url(beijin1.jpg);
    background-repeat: no-repeat;
    background-size: 100% auto;
}
</style>
</head>
<body>
<%-- <a href="<%=request.getContextPath()%>/query">用户信息查询</a> --%>
<!-- <form method="post" action="login">
用户名：<input type="text" name="uname"/>
密    码：<input type="password" name="upassword"/>
<button type="submit">提交</button>
</form> -->
 <form method="post" action="login">
    <div id="login-box">
        <h1>小叮当家二手交易平台</h1>
        <div class="form">
            <div class="item">
                <!-- <i class="fa fa-user" aria-hidden="true"></i> -->
                                                       用户名:<input type="text" placeholder="请输入用户名" name="uname">
            </div>
            <div class="item">
               <!--  <i class="fa fa-key" aria-hidden="true"></i> -->
                                                      密&nbsp&nbsp码:<input type="password" placeholder="请输入密码" name="upassword">
            </div>
        </div>
        <button type="submit">登录</button>
        <button type="button"  onclick="window.location.href='regist'">注册</button>
    </div> 
</form>
</body>
</html>