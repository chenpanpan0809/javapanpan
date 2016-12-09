<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="fileReceive.jsp" method="post">
<span>输入文件名称</span>
<input name="fileName" type="text"><br/>
<p>输入文件的内容</p>
<textarea name="fileContent" rows="5" cols="30"></textarea>
<br/>
<input name="submit" type="submit" value="提交">
<input name="reset" type="reset" >  
</form>
</body>
</html>