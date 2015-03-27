<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>

<link href="css/jquery-ui.min.css" rel="stylesheet" type="text/css">
<script>
$("#document").ready(function(){
$("#date").datepicker();
$("#button").button();
$( document ).tooltip();
})


</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Initiate Tour</title>
</head>
<body>
	<fmt:setLocale value="en" />
	<fmt:setBundle basename="com.properties.LoneTrek" var="example" />
	<c:set var="nameMessage"><fmt:message key="name.message" bundle="${example}"/></c:set>
	<c:set var="originMessage"><fmt:message key="origin.title" bundle="${example}"/></c:set>
	<table cellspacing="20">
		<form:form action="" commandName="tourInfo" id="mainForm">
			<tr>
				<td>Name Of Tour</td>
				<td><form:input path="name" autocomplete="off"
						title="${nameMessage }" /></td>
			
			</tr>
			<tr>
				<td>Origin</td>
				<td><form:input path="origin" autocomplete="off" title="${originMessage }" /></td>
			</tr>
		
			<tr>
				<td>Destination</td>
				<td><form:input path="destination" autocomplete="off" /></td>
			</tr>
			<tr>
				<td>People Allowed</td>
				<td><form:radiobutton path="allowedPeople" value="fb" /> FB
					Friend</td>
				<td><form:radiobutton path="allowedPeople" value="all" />
					Anyone</td>
			</tr>
			<tr>
				<td>Start Date</td>
				<td><input type="text" name="date" id="date" ></td>
			</tr>
			<tr>
				<td><input type="submit" value="Lets Pack" id="button"></td>
			</tr>

		</form:form>
	</table>
</body>
</html>