<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1 align="center"> Registration Form </h1>
	<div align="center">
	<form:form action="process-registration" method="get" modelAttribute="reg">
			<label for="usr">User : </label><form:input id="usr" path="user" /><br>
			<label for="un">UserName : </label><form:input id="un" path="username" /><br>
			<label for="pwd">Password : </label><form:password id="pwd" path="password" /><br>
			<label for="cntry">Country : </label>
			 <form:select id="cntry" path="country">
				<form:option value="india">India</form:option>
				<form:option value="uk">UK</form:option>
				<form:option value="usa">USA</form:option>
				<form:option value="slc">SLC</form:option>
			 </form:select>
        <br>
		<form:checkbox path="hobbies" value="cricket" />Cricket 
        <form:checkbox path="hobbies" value="java" />Java 
        <form:checkbox path="hobbies" value="football" />Football
	    <br>

		<label for="gen">Gender</label>
		<form:radiobutton id="gen" path="gender" value="M" />Male
	    <form:radiobutton id="gen" path="gender" value="F" />Female
	    <br>
		<input type="submit" value="Register" />

     </form:form>
     </div>

</body>
</html>