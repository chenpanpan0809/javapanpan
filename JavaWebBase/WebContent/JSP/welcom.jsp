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
		if (null != session.getAttribute("userid")) {
			
			if(session.isNew()){
				%>
				
	<h3>
		欢迎<%=session.getAttribute("userid")%>新用户光临本系统
	</h3>	
	<% 
			}else{
				%>
				<h3>您已经是老用户了</h3>	
				<%
			}
			 %>

	<a href="loginOut.jsp">注销</a>
	<%
		} else {
	%>
	<h3>
		请先登陆该系统 点击<a href="login.jsp"></a>login
	</h3>
	<%
		}
	%>

</body>
</html>