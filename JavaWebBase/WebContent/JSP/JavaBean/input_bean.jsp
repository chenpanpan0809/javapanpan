<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="ood.javabean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
JavaDemo javaDemo = new JavaDemo();//声明，实例化对象，通过自己定义的类
javaDemo.setName(request.getParameter("userName"));//设置userName的属性
javaDemo.setAge(Integer.parseInt(request.getParameter("ageman")));//设置ageman的属性。

%>
<h3>姓名：<%=javaDemo.getName() %></h3>
<h3>年龄：<%=javaDemo.getAge() %></h3>
</body>
</html>