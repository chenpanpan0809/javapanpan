<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户个人信息</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("username");
String [] checked = request.getParameterValues("interest");

%>
<h3>姓名：<%=name %></h3>

<%
if(null!=checked){
	%>
	<h3>兴趣：
	<% 
	for(String inter:checked){
		%>
		<%=inter %>,
		<% 
	}
	%>
	</h3>
	<%
}
%>

</body>
</html>