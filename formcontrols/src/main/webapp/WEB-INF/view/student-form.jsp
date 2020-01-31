<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName"/>
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName"/>
		<br><br>
	    Email:<input type="email"name="email">
	    <br><br>
	    Age:<input type="number"name="age" value="age">
	    <br><br>
		Country:
		
		<form:select path="country">
		<form:option value="select" label="select..."/>
		<form:option value="India" label="India"/>
		<form:option value="Brazil" label="Brazil"/>
		</form:select><br/><br/>
		
			

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>


