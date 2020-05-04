<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
}
</style>

<script type="text/javascript">
	function validateUserName() {
		var user = document.getElementById('yn').value;

		if (user.length < 3) {
			alert("Should be between 3 and 15");
			return false;
		}
		return true;

	}
</script>


</head>
<body>
	<h1 align="center">Love Calc</h1>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" >
		<div align="center">
			<p>
				<label for="yn">YourName</label>
				<form:input id="yn" path="UserName" />
				<form:errors path="UserName"/>
			</p>
			<p>
				<label for="cn">CrushName</label>
		<form:input id="cn" path="CrushName" />
			</p>
			<input type="submit" value="Calculate" />
		</div>
	</form:form>

	<br>
	<br>
	<br>
	<br>
	<div align="center">
		<form:form action="registration">
			<input type="submit" value="Submit" />
		</form:form>
	</div>
s

</body>
</html>