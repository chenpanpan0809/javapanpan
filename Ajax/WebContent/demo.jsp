<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<script src="/Ajax/jquery-1.4.4.min.js" type="text/javascript"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <form:form modelAttribute="addUser" method="post"> 	
		<h1>bookName:javaEE</h1>
		<h1>bookSize:25</h1> --%>
	<input type="button" id="submit" value="Submit" />
	<%-- </form:form>  --%>

	<script type="text/javascript">
		$(function() { 
			$("#submit").click(function() {   
	           var postdata ='{"bookName":"javaEE","bookSize":"25","bookPrice":"30$","bookPages":"1000"} '; 
	           
			    $.ajax({  
			        type : 'POST',  
			        contentType: "application/json;charset=utf-8",  
			        url : 'http://localhost:8080/Ajax/addUser.action',  
			        
			        /* dataType : 'json',  */ 
			        data : postdata,  
			      success : function(data) {  
			            alert('bookName : '+data.bookName+'\nbookSize : '+data.bookSize+'\nbookPrice : '+data.bookPrice+'\nbookPages : '+data.bookPages);  
			        },  
			        error : function() {  
			            alert('error...');  
			        }   
			    }); 
			});
	    });
	</script>
</body>
</html>