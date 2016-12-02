<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ood.javabean.*" %> 
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="book" scope="page" class="ood.javabean.BookBean">
<%-- <jsp:setProperty name="book" property="bookName" />
<jsp:setProperty name="book" property="bookNum" /> --%>

</jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书订购</title>
</head>

<body>
<%
BookBean sim = new BookBean();
sim.setBookName(request.getParameter("bookName"));
sim.setBookName(request.getParameter("bookName"));

%>
<center>
<h2>订购图书清单</h2>
<hr/>
书名:<%=book.getBookName()%>
<br/>
数量:<%=book.getBookNum()%>
</center>
</body>
</html>