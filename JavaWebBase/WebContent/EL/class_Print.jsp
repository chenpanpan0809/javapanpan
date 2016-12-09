<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="ood.javabean.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Infor infor = new Infor();
infor.setName("盼盼");
infor.setAge(20);
infor.setLoaction("合肥");
request.setAttribute("receive", infor);

%>
<h3>姓名：${receive.name }</h3>
<h3>年龄：${receive.age }</h3>
<h3>地点：${receive.loaction}</h3>

</body>
</html>