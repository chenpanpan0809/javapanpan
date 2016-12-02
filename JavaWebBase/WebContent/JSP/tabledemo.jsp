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
int rows =10,cols =10;
out.println("<table border=1px;color:pink;>");
for(int x = 1;x<rows;x++){
	out.println("<tr>");
	for(int y= 1;y<cols;y++){
		if(y<=x){
			out.println("<td>"+y+"*"+x+"="+(x*y)+"</td>");
		}
		 else{
			out.println("<td></td>");
		}
	}
	out.println("</tr>");
}
out.println("</table>");
%>
</body>
</html>