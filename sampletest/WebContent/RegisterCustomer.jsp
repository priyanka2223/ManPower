<!DOCTYPE html>
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
		url("https://cdn.dribbble.com/users/767646/screenshots/1943995/team.gif");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-width: 466px;
	 background-size:cover;
}
</style>
</head>
<body>
	<div class="container" id="wrap">
		<div class="row">
			<div class="col-md-4 col-md-offset-3">
				
				<form action="RegisterCustomer" method="post" accept-charset="utf-8" class="form"
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
						<input type="text" name="email" value=""
							class="form-control input-lg" placeholder="email" />
					</div>
					<div class="form-group">
						<input type="text" name="pnum" value=""
							class="form-control input-lg" placeholder="Mobile Number" />
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