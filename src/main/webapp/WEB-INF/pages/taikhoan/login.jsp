<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dang Nhap</title>
</head>
<body>
	
	${message }
	<spring:form method="post" commandName="tk" action="login">
		Username <spring:input path="username"/><br>
		Password <spring:password path="password"/><br>
		<input type="submit" value="Login">
	</spring:form>
	
</body>
</html>