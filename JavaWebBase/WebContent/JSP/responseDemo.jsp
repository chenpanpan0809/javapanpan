<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%!int count = 0; %>
<%
response.setHeader("refresh", "3;url=https://hao.360.cn/?src=bm");
response.sendRedirect("http://www.baidu.com");

%>
<h3>3秒后跳转到360导航页面，如果没有跳转请点击<a href="http://www.baidu.com">这里</a></h3>
<h4>已经访问<%=count++%>次了</h4>
</body>
</html>