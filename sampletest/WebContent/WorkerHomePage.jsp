<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
         background-image: url("https://thumbs.dreamstime.com/z/house-repair-property-maintenance-laborer-tool-equipment-home-service-isolated-white-wall-background-house-repair-124982803.jpg");
         background-repeat: no-repeat;
         background-attachment: fixed;
         background-width:200px; 
         background-size:cover;
         }

</style> 
<title>Worker Home Page</title>
</style>
</head>
<body>
<div class="bg-img">
<%
		String user = (String)session.getAttribute("user");
		 %>
		<body>
		<h3>Hi: <%=user %><center><h2>WELCOME TO WORKER HOME PAGE</h2></center>
		<hr>
		<h3><center><a href='DisplayWorkerProfile'><button type="button" class="btn btn-primary-lg">Display Profile</button></a></center></h3> 
		<h3><center><a href='Home.html'><button type="button" class="btn btn-primary-lg">Log out</button></a></center></h3> 
</div>	
</body>
</html> 
