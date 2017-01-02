<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ApplyLeave</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/apply/add" method="post"  modelAttribute="userLeaveModel">
		<form:label path="user">
			<form:input path="user.userId"/>	
		</form:label><br/>
		<form:select path="leave.leaveId">
			<%-- <form:option value="Select Leave">Select Leave</form:option>
			 --%><form:options items="${leaves}" itemLabel="leaveType" itemValue="leaveId"/>	
		</form:select>
		<br/>
			
		<form:label path="leaveReason">
			Reason : <form:input path="leaveReason"/>
		</form:label><br/>
		 <form:label path="startDate">
			StartDate : <form:input path="startDate" ></form:input>
		</form:label> <br/>
		 <form:label path="endDate">
			EndDate : <form:input path="endDate"/>
		</form:label>  <br/>
		<input type="submit" value="Submit Leave">
	</form:form>
</body>
</html>