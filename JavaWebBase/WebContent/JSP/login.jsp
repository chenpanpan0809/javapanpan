<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
<span>用户名:</span>
<input name="username" type="text">
<br/>
<span>密&nbsp;&nbsp;&nbsp;码:</span>
<input name="password" type="password">
<br/>
<input name="submit" type="submit">
<input name="reset" type="reset">
</form>
<%
String name = request.getParameter("username");
String password = request.getParameter("password");
 if("chenpanpan".equals(name)&&"12345".equals(password)){
 
	
	response.setHeader("refresh", "2;URL=welcom.jsp");
	session.setAttribute("userid", name);
%>
<h3>用户登陆成功，2秒后跳到个人页面</h3>
<h3>如果没有跳转成功，请点击<a href="welcom.jsp">这里</a></h3>
<%}
else{
	if(name==null&&password==null){
		%>
		<h3>请输入用户名和密码</h3>
	<%}
	
	else{
		%>
	<script type="text/javascript">
	alert(" 用户名或者密码错误");
	</script>
	<%
	}
	%>
<% 
}
 %>	
</body>
</html>