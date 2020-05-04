<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 User : ${reg.user}<br>
 Username : ${reg.username} <br>
 Password : ${reg.password}<br>
 Country : ${reg.country}<br>
 Hobbies : 
 <c:forEach var="temp" items="${reg.hobbies}">
 ${temp}
 </c:forEach>
 
 <br>
 Gender : ${reg.gender} <br>

</body>
</html>