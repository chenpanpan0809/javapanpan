<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>跳转定义页面</title>
</head>
<body>
<jsp:forward page="forwardDemo.jsp">
<jsp:param value="panpan" name="name"/>
<jsp:param value="360" name="info"/>

</jsp:forward>


</body>
</html>