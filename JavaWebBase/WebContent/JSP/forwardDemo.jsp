<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>跳转到此页面</title>
</head>
<body>
<h3>这是跳转之后的页面</h3>
<h3><%=request.getParameter("name") %></h3>
<h3><%=request.getParameter("info") %></h3>
</body>
</html>