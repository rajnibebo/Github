<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Welcome to Home Page
	<form:form action="usr/get" modelAttribute="userObj" method="POST">
		<form:label path="userId">
			Enter User ID ::: <form:input path="userId"/>
		</form:label>
		<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>