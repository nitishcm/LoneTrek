<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<link href="css/jquery-ui.min.css" rel="stylesheet" type="text/css">
<link href="css/mainCSS.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
	$("#document").ready(function() {
		$("#buttonInitiate").button();
		$("#buttonDiscover").button();
	})
</script>
<title>Insert title here</title>
</head>
<body>
	<div class="body">
		<div class="header" style="padding-bottom: 20px;">
			<%@include file="jsp/Header.jsp"%>
		</div>
		<div class="form">
			<form action="initiateTour.html" method="get">
				<input type="submit" id="buttonInitiate" value="Initiate A Tour">
			</form>
		</div>
		<div class="form">
			<form action="discoverTour.html" method="get">
				<input type="submit" id="buttonDiscover" value="Discover A Tour">
			</form>
		</div>
	</div>
</body>
</html>