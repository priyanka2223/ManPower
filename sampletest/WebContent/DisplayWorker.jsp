<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.ArrayList,com.ts.dto.Worker"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="AdminHomePage.jsp" />
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>USER NAME</th>
			<th>EXPERIENCE</th>
			<th>CHARGES</th>
			<th>PHONE NO</th>
			<th>STATUS</th>
			<th colspan=2>Action to be taken</th>
		</tr>
		<c:forEach var="worker" items="${workersData}">
			<tr>
				<td>${worker.workId}</td>
				<td>${worker.name}</td>
				<td>${worker.userName}</td>
				<td>${worker.exp}</td>
				<td>${worker.charges}</td>
				<td>${worker.phoneNo}</td>
				<td><a href='ChangeStatus?workId=${worker.workId}&statusId=1'>Activate</a></td>
			    <td><a href='ChangeStatus?workId=${worker.workId}&statusId=0'>DeActivate</a></td>
				

			</tr>
		</c:forEach>
	</table>
</body>
</html>





