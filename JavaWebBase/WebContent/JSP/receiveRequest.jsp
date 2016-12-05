<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>receivePage</title>
</head>
<body>
<%
String loac =(String) session.getAttribute("location");
String username = (String)session.getAttribute("name");
/* String method = request.getMethod();
String method2 = request.getRemoteAddr(); */
%>
<p>跳转后的页面</p>
<h2>地点：<%=loac %></h2>
<h2>姓名：<%=username %></h2>
<%-- <h2>提交方式：<%=method %></h2>
<h2> 用户地址：<%=method2 %></h2> --%>
</body>
</html>