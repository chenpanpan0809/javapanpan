<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="param_receive.jsp" method="post">
<span>姓名：</span>
<input name="ueserName" type="text">
<br/>
<span>兴趣爱好</span><br/>
<input name="sport" type="checkbox" value="唱歌"><span>唱歌</span>
<input name="sport" type="checkbox" value="跑步"><span>跑步</span>
<input name="sport" type="checkbox" value="爬山"><span>爬山</span>
<input name="sport" type="checkbox" value="看书"><span>看书</span>
<input name="submit" type="submit">

</form>
</body>
</html>