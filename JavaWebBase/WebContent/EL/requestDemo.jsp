<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
pageContext.setAttribute("color", "green");


%>
<body bgcolor="${pageScope.color }">
<p>中国</p>
<font size="${pageScope['size']"></font>

<%-- <h3>IP地址：${pageScope.page.remoteAddr}</h3> --%>
</body>
</html>