<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
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
request.setCharacterEncoding("UTF-8");
%>
 ${param.ueserName}

<h3>第一个参数：${paramValues.sport[0]}</h3>
<h3>第二个参数：${paramValues.sport[1]}</h3>
<h3>第三个参数：${paramValues.sport[2]}</h3>
<h3>第四个参数：${paramValues.sport[3]}</h3>



</body>
</html>