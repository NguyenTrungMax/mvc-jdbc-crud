<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/form.css">
<title>Update information</title>
</head>
<body>
	<center>
		<form action="../update" method="get">
		<div>
                <p>Id</p>
                <input type="hidden" name="id" value="<%= request.getParameter("id1") %>"><%= request.getParameter("id1") %>  
            </div>
			<div>
				<p>First name</p>
				<input type="text" id="firstName" name="nameFirst">
			</div>
			<div>
				<label>Last name</label><br> <input type="text" id="lastName"
					name="nameLast">
			</div>
			<div>
				<label>Age</label><br> <input type="text" id="age"
					name="ageEmp">
			</div>
			<div>
				<textarea name="address"></textarea>
			</div>
			<div>
				<button type="submit" value="login">update</button>
				<a href="../display-all">Quay lai</a>
			</div>
		</form>
	</center>
</body>
</html>