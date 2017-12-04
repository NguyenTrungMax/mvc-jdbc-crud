<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form jsp</title>
<link rel="stylesheet" type="text/css" href="../css/form.css">
<script type="text/javascript" src="../js/form.js"></script>
</head>
<body>
		<div>
		<h2>Form dang ki hoc</h2>
		<div id="main-form">
			<form action="../insert" method="get" onsubmit="javascript: return !!(isValidate() & checkPhone())">
				<div>
					<p>First name</p>
					<input type="text" id="firstName" name="nameFirst">
					<input type="file" name="filename" id="file" onchange="test()" style="float: right;" >
					<span style="color: red" id="errFirstName"></span>
     				<img src="" id="images" alt="your image" style="width: 100px; height: 100px; display: none; float: right;">
				</div>
				<div>
					<label>Last name</label><br>
					<input type="text" id="lastName" name="nameLast">
					<span style="color: red" id="errLastName"></span>
				</div>
				<div>
                    <label>Age</label><br>
                    <input type="text" id="age" name="ageEmp">
                    <span style="color: red" id="errAge"></span>
                </div>
				<div>
					<label>Phone number</label><br>
					<input type="text" id="phone1" name="tele1"  class="phone" size="3" maxlength="3">
					<input type="text" id="phone2" name="tele2" class="phone" size="3" maxlength="3">
					<input type="text" id="phone3" name="tele3" class="phone" size="4" maxlength="4">
					<span style="color: red" id="errPhone"></span>
				</div>
				<div id="gender">
					<input type="radio" name="gender" value="Male"  class="gender" required="true">Male
					<input type="radio" name="gender" value="Female"  class="gender" required="true">Female
				</div>
				<div>
					<textarea placeholder="address" name="address"></textarea>
				</div>
				<div>
					<input type="checkbox" name="hobbies" class="hobbie">By Bike
					<input type="checkbox" name="hobbies" class="hobbie">By Car 
				</div>
				<div>
					<select name="vehicle" id="" >
						<option value="Meter">Meter</option>
						<option value="Ronaldo">Ronaldo</option>
					</select>
				</div>
				<div>
				<button type="submit" value="login" >Insert</button>
			</div>
			</form>
		</div>
	</div>
	
</body>
</html>