<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>加法:${2+6}</h3>
<h3>减:${2-6}</h3>
<h3>乘:${2*6}</h3>
<h3>除:${2/6}</h3>
<h3>取余:${6%2}</h3>
<hr/>
<h3>${20==30}</h3>
${20 gt 30}
${20 ge 30}
${20 lt 30}
<hr/>
<h2>逻辑运算符</h2>
<%   
request.setAttribute("A", true);
request.setAttribute("B", false);

%>
<h3>与操作：  ${A&&B}</h3>
<h3>或操作：  ${A||B}</h3>
<h3>非操作：  ${not A}</h3>
<h3>非操作：  ${!A}</h3>
${empty c}
</body>
</html>