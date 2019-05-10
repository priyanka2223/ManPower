<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.ts.dto.Subcategory" import="java.util.List,com.ts.dao.SubcategoryDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
body {
	background-image:
		url("https://cdn.dribbble.com/users/767646/screenshots/1943995/team.gif");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-width: 466px;
	 background-size:cover;
}
</style>
</head>
<body>
	<% 
SubcategoryDAO subcategoryDao = new SubcategoryDAO();
List<Subcategory> subcategoryList = subcategoryDao.getAllSubcategorys();
request.setAttribute("subcategoryList", subcategoryList); 
%>
<div class="container" id="wrap">
		<div class="row">
			<div class="col-md-4 col-md-offset-3">
				<form action="RegisterWorker" method="post" accept-charset="utf-8" class="form"
					role="form">
					<legend>
						<centre>
							<h1>Sign Up</h1>
							</centre>
					</legend>
					
					<div class="form-group">
						<input type="text" name="name" value=""
							class="form-control input-lg" placeholder="Name" />
					</div>
					<div class="form-group">
						<input type="text" name="uid" value=""
							class="form-control input-lg" placeholder="Username" />
					</div>
					<div class="form-group">
						<input type="password" name="pwd" value=""
							class="form-control input-lg" placeholder="Password" />
					</div>
					<div class="form-group">
						<input type="text" name="exp" value=""
							class="form-control input-lg" placeholder="experience" />
					</div>
					<div class="form-group">
						<input type="text" name="chrg" value=""
							class="form-control input-lg" placeholder="charges" />
					</div>
					<div class="form-group">
						<input type="text" name="pnum" value=""
							class="form-control input-lg" placeholder="Phone No" />
					</div>
					
					<div class="form-group">
					     <div class="col-sm-15 mb-10">
                             <select name="subId" class="form-control">
                               <c:forEach var="subcategory" items="${subcategoryList}">
                               <option value="${subcategory.subId}">${subcategory.subType}</option>
                               </c:forEach>
                             </select>
                   </div>
                   </div>
					
					<div class="row">
						<div class="col-xs-4 col-md-4"></div>
					</div>

					<br /> <span class="help-block"><a style= color:red;>
						</a></span>
					<button class="btn btn-lg btn-primary btn-block signup-btn"
						type="submit">REGISTER</button>
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>