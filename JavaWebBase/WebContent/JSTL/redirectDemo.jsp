<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String info = "www.gdf,dsa?w4";
pageContext.setAttribute("intoo", info);
%>

<h3>拆分结果
<c:forTokens items="${intoo}" delims=".,?" var="con">

${con }

</c:forTokens>
</h3>
<h3>
<c:forTokens items="li:gy,ji" delims=":," var="com">
${com},
</c:forTokens>
</h3>
</body>
</html>