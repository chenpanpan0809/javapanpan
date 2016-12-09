<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${10<30 }" var="res">
		<h3>${res}</h3>
	</c:if>
	<%
		request.setAttribute("name", 10);
	%>
	<c:choose>
		<c:when test="${name==10}">
			<h1>1</h1>

		</c:when>
		<c:when test="${name==20}">
			<h2>2</h2>
</c:when>
		<c:otherwise>
			<h3>都不符合</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>