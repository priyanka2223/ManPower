<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.ts.dto.Worker"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="WorkerHomePage.jsp"></jsp:include>
  <%
	%>
	<!-- 
	<jsp:useBean id="workerData" class="com.ts.dto.Worker"
		scope="request" />
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>USER NAME</th>
			<th>EXPERIENCE</th>
			<th>CHARGES</th>
		</tr>
		<tr>
			<td><%=workerData.getWorkId()%></td>
			<td><%=workerData.getName()%></td>
			<td><%=workerData.getUserName()%></td>
			<td><%=workerData.getExp()%></td>
			<td><%=workerData.getCharges()%></td>
		</tr>
	</table>
 -->
 
 	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>USER NAME</th>
			<th>EXPERIENCE</th>
			<th>CHARGES</th>
			<th>SUB_SERVICE ID</th>
			<th>SUB_SERVICE NAME</th>
		</tr>
		<tr>
			<td>${workerData.workId}</td>
			<td>${workerData.name}</td>
			<td>${workerData.userName}</td>
			<td>${workerData.exp}</td>
			<td>${workerData.charges}</td>
			<td>${workerData.subcategory.subId}</td>
			<td>${workerData.subcategory.subType}</td>
		</tr>
	</table>
</body>
</html>