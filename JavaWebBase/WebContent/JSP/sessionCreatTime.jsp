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
Long start = session.getCreationTime();
Long end = session.getLastAccessedTime();
Long time = (end-start)/1000;
%>
<h3>您已在此处停留<%=time %>秒</h3>
</body>
</html>