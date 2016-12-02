<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form name="loginPage" action="loginReceive.jsp" method="post">
<span>QQ账号：</span>
<input name="userName" type="text" size="32"/>
<br/>
<span>QQ密码：</span>
<input name="passWord" type="password" size="32"/>
<br/>
<input  name="submit" type="submit" value="登陆">&nbsp;&nbsp;&nbsp;&nbsp;
<input name="resert" type="reset" value="重置">
</form>
</center>
</body>
</html>