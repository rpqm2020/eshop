<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.eshop.po.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息查询</title>
<style type="text/css">
     table{
          background-color:#ffcccc;
          border:1px solid gray;
          align:center;
          margin:auto;
         }
     th,td{  width:200px;
             text-align:center;
             font-size:10px;
             color:black;'}
</style>
</head>
     <table  border="1">
     <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr> 
  <%
  //循环显示数据
   List<Employee> emplist=(List)request.getAttribute("emp"); 
   if(emplist.size()!=0){
     for(int i=0;i<emplist.size();i++){
    	 Employee em =new Employee(); 
         em = emplist.get(i);
  %>
  
<tr>
     <td><%=emplist.get(i).getEid() %></td>
     <td><%=emplist.get(i).getEname() %></td>
     <td><%=emplist.get(i).getAge()%></td>
  </tr>
  <%
     }
   }
%>
  </table>
</html>