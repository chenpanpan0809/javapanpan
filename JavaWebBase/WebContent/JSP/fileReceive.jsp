<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.PrintStream"%>
<%@page import="java.io.File"%>
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
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("fileName");//接收保存文件名称
String content = request.getParameter("fileContent");//接受保存文件内容
String filename1 = this.getServletContext().getRealPath("/")+"note"+File.separator+name;
File file = new File(filename1);//实例化File类对象
if(!file.getParentFile().exists()){			//判断父路径是否存在
	
	file.getParentFile().mkdir();
}
//写文件
PrintStream wr = new PrintStream(new FileOutputStream(file));
wr.println(content);
wr.close();
//读取文件
Scanner scanner = new Scanner(new FileInputStream(file));
scanner.useDelimiter("\n");
StringBuffer buf = new StringBuffer();
while(scanner.hasNext()){
	
	buf.append(scanner.next()).append("<br>");
}

scanner.close();
%>
<%=buf %>
</body>
</html>