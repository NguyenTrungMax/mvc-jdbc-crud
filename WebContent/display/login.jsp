<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/login.css"/>
<title>Trang dang nhap</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/loginServlet" method="get">
        <div>
            <label>username</label>
            <input type="text" name="username"/>
        </div>
        <div>
            <label>password</label>
            <input type="password" name="password"/>
        </div>
        <div>
            <input type="checkbox" value="remember"/> Remember me
        </div>
        <div>
            <input type="submit" value="Login"/>
        </div>
    </form>
</body>
</html>