<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loggging Form</title>
</head>
<body>
	<h1>Send Us !!!</h1>
	<form method="post" action="forEnquiry">
		<table>
			<tr>
				<td align="right">To :</td>
				<td><input type="text" name="toEmail" size="75">
			</tr>
			<tr>
				<td align="right">Subject :</td>
				<td><input type="text" name="toSubject" size="75">
			</tr>
			<tr>
				<td align="right">Message :</td>
				<td><textarea name="toMessage" cols="75" rows="6"></textarea>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Send">
			</tr>
		</table>
	</form>
</body>
</html>