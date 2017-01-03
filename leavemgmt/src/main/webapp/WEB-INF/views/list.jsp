<%@page import="com.trantor.leavesys.models.UserModel"%>
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
	<c:forEach items="${listUsers}" var="user">
		${user.userName} <br/>
		<c:forEach items="${user.userRoles}" var="role">
			${role.userRole}
		</c:forEach>
		<br/>
	</c:forEach>
</body>
</html>