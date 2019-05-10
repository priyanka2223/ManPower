<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="AdminHomePage.jsp"></jsp:include>
<% /*
DeptDAO deptDao = new DeptDAO();
List<Dept> deptList = deptDao.getAllDepts();
request.setAttribute("deptList", deptList); */
%>
<form action="AddCategory" method="POST">
Enter Type :<input type="text" name="catType"><br/>
<input type="submit" value="OK">
</form>

</body>
</html>