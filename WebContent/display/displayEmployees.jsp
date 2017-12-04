<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>	
	   <h2>Display All Information of Employee</h2>
	   <table border="1" style="width: 400px; height: 200px;">
	       <thead>
	           <tr>
	               <th>ID</th>
	               <th>Name</th>
	               <th>Age</th>
	               <th>Address</th>
	               <th>Update</th>
	               <th>Delete</th>
	           </tr>
	       </thead>
	       <tbody>
	          <c:forEach items="${listEmployees}" var="s">
	           <tr>
	               <td>${s.id}</td>
	               <td>${s.name}</td>
	               <td>${s.age}</td>
	               <td>${s.address}</td>
	               <td>
	                   <a href="${pageContext.request.contextPath}/display/editEmployee.jsp?id1=${s.id}">Update</a>
	               </td>
	               <td>
	                   <a href="DeleteServlet?id=${s.id}">Delete</a>
	               </td>
	           </tr>
	          </c:forEach>
	       </tbody>
	   </table>
	</center>
</body>
</html>