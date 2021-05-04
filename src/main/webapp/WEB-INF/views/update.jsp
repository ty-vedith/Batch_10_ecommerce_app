<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String message = (String) request.getAttribute("message"); %>


<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>


	<% if(message != null) { %>
	
	<h2> <%=message %> </h2>
	
	<% } %>


	<fieldset>
		<legend>Update Item</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Item ID</td>
					<td>:</td>
					<td><input type="number" name="id"
						placeholder="Enter the ID" required="required"></td>
				</tr>
				<tr>
					<td>Item Name</td>
					<td>:</td>
					<td><input type="text" name="name"
						placeholder="Enter the name" required="required"></td>
				</tr>
			
				<tr>
					<td>Item Quantity</td>
					<td>:</td>
					<td><input type="number" name="quantity"
						placeholder="Enter the quantity" required="required"></td>
				</tr>
				
				<tr>
					<td>Item Price</td>
					<td>:</td>
					<td><input type="number" name="price"
						placeholder="Enter the price" required="required"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Add item"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>