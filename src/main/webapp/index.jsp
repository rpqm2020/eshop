<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>系统首页</title>
<script type="text/javascript">


</script>
</head>
<body>
<%-- <a href="<%=request.getContextPath()%>/query">用户信息查询</a> --%>
<form method="post" action="login">
用户名：<input type="text" name="uname"/>
密    码：<input type="password" name="upassword"/>
<button type="submit">提交</button>
</form>
</body>
</html>