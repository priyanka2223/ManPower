<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.ts.dto.Category" import="java.util.List,com.ts.dao.CategoryDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="AdminHomePage.jsp"></jsp:include>
<% 
CategoryDAO categoryDao = new CategoryDAO();
List<Category> categoryList = categoryDao.getAllCategorys();
request.setAttribute("categoryList", categoryList); 
%>
<form action="AddSubcategory" method="POST">
Enter  Type :<input type="text" name="name"><br/>
Enter  Price :<input type="text" name="price"><br/>
Select Category : <select name="catId">
<c:forEach var="category" items="${categoryList}">
<option value="${category.catId}">${category.catType}</option>
</c:forEach>

</select>
<input type="submit" value="LOGIN">
</form>
</body>
</html>