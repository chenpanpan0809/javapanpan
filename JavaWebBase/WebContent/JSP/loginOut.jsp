<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("refresh", "2;URL= login.jsp");
		session.invalidate();
	%>
	<h3>您已经成功退出本系统，两秒后跳转到首页</h3>
	<h3>
		如果没有跳转，请点击<a href="login.jsp">return</a>
	</h3>
</body>
</html>