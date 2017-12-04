function test() {
        var file = document.getElementById('file').files[0];
        document.getElementById('images').src = "image/" + file.name;
        document.getElementById('images').style.display = 'block';
     }

//Bat su kien cho thang onclick
function isValidate() {
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	
	
	if (firstName == "" && lastName == "" ) {
		alert("Firstname Empty");
		alert("last Empty");
		return false;
	} else
	if (firstName == "" ) {
		alert("firstName Empty");
		return false;
	} else if (lastName == "") {
		alert("lastName empty");
		return false;
	}
	return true;
	
}
//kiem tra null hay k

function isNull(str) {
	if (str.length <=0 || str.equals(null)) return false;
}
function checkPhone() {
	var phone = document.getElementById("phone1").value	+ document.getElementById("phone2").value
	+ document.getElementById("phone3").value;
	if (phone.length == 10) {
		for (var i = 0; i < phone.length; i++) {
			if (phone.charAt(i) < "0" || phone.charAt(i) > "9") {
				alert("Please input number");
				return false;
			}
		}
	} else {
		alert("Please input 10 numbers");
		return false;
	}
	return true;
}

