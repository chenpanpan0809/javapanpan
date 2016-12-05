<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>requestPage</title>
</head>
<body>
<%
session.setAttribute("location", "合肥");
session.setAttribute("name", "panpan");

%>

<!-- <a href="receiveRequest.jsp"><button type="button" >跳转</button> </a>
 -->
 <jsp:forward page="receiveRequest.jsp"></jsp:forward> 
 </body>
</html>