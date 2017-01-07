<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:if test="${not empty error}">
			${error}
		</c:if>
	<form action="custom_login" method="post">
		Name :: <input type="text" name="username"/><br/>
		Password ::<input type="password" name="password"/><br/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
		<c:if test="${not empty param.error }">
			<input type="text" value="${param.error}" name="error">
		</c:if>
		<input type="submit">
	</form>
</body>
</html>