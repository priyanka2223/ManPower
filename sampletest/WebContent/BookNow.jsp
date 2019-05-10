<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.ts.dto.Subcategory" import="java.util.List,com.ts.dao.SubcategoryDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Sign Up</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
body {
	background-image:
		url("https://thumbs.dreamstime.com/z/house-repair-property-maintenance-laborer-tool-equipment-home-service-isolated-white-wall-background-house-repair-124982803.jpg");
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
				
				<form action="BookNow" method="post" accept-charset="utf-8" class="form"
					role="form">
					<legend>
						<centre>
							<h1>Book Now</h1>
							</centre>
					</legend>
					
					<div class="form-group">
						<input type="text" name="name" value=""
							class="form-control input-lg" placeholder="Name" />
					</div>
					<div class="form-group">
						<input type="text" name="email" value=""
							class="form-control input-lg" placeholder="Email" />
					</div>
					<div class="form-group">
						<input type="text" name="number" value=""
							class="form-control input-lg" placeholder="Mobile Number" />
					</div>
					<div class="form-group">
						<input type="text" name="address" value=""
							class="form-control input-lg" placeholder="Address" />
					</div>
					<div class="form-group">
						<input type="date" name="date" value=""
							class="form-control input-lg" placeholder="YYYY-MM-DD" />
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
						type="submit">Book</button>
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>