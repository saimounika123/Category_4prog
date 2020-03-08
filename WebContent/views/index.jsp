<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Category</h2>
	<form action="home" commandName="category" method="post">
		<input type="text" path="categoryName" name="categoryName"
			placeholder="Enter Category Name" /> <br> <br> <input
			type="text" path="description" name="description"
			placeholder="Enter description " /> <br> <br>
		<button type="submit" id="register" style="background-color: #90EE90">Create
			Category</button>
	</form>
</body>
</html>