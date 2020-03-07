<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addAlien">

			<table>
			<tr>
				<td>Enter ID</td>
				<td>:</td>
				<td><input type="text" name="aid"></td>
			</tr>
			<tr>
				<td>Enter Name</td>
				<td>:</td>
				<td><input type="text" name="aname"></td>
			</tr>
			<tr>
				<td>Enter Technology</td>
				<td>:</td>
				<td><input type="text" name="tech"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
				<td></td>
				<td></td>
			</tr>
			</table>
			<br><br><br><br><br><br>
			
		</form>

		<form action="getAlien">
			<table>
			<tr>
				<td>For User ID</td>
				<td>:</td>
				<td><input type="text" name="aid"></td>
			</tr>
			<tr>
				<td><input type="submit" value="For User ID"></td>
				<td></td>
				<td></td>
			</tr>
			</table>
		</form>
</body>
</html>