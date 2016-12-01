<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<p>当前时间</p>
		<%@include file="NewFile.html"%>

		<hr />
		<%
			Date date = new Date();
			int date1 = date.getHours();
			if (date1 > 0 && date1 <= 6) {
				out.println("早上好");
			} else if (date1 > 6 && date1 < 12) {
				out.println("上午好");
			} else if (date1 > 12 && date1 < 18) {
				out.println("下午好");
			} else {
				out.println("晚上好");
			}
		
		%>
	</center>
</body>
</html>