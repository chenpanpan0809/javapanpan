<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="ood.javabean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//两种实例化对象的方式，一种是通过new，另外一种是通过jsp：useBean的方式
BookBean bookBean = new BookBean();

bookBean.setBookName(" 入门到精通o");
bookBean.setBookNum(20); 
pageContext.setAttribute("book", bookBean);

%> 
 <%-- <jsp:useBean id="poo" class="ood.javabean.BookBean"></jsp:useBean> --%>

 <h3><c:set target="${book}" property="bookName" value="入门到精通" ></c:set></h3>  
<h3>书名：${book.bookName}</h3>
<h2><c:out value="hellow"></c:out></h2>
</body>
</html>