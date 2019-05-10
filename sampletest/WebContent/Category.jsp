<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.ArrayList,com.ts.dto.Category"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="HomePage.jsp" />
	<table border=2 align=center>
		<tr>
			<th>CID</th>
			<th>CTYPE</th>
		</tr>
		<c:forEach var="category" items="${categorysData}">
			<tr>
				<td>${category.cId}</td>
				<td>${category.cType}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>





