<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是包含页面</title>
</head>
<body>
<%
String userName = "panpan";

%>
<h1>动态包含并传递参数 </h1>
<jsp:include page="include.jsp">
<jsp:param value="<%=userName %>" name="name"/>
<jsp:param value="www.baidu.com" name="info"/>
</jsp:include>


</body>
</html>