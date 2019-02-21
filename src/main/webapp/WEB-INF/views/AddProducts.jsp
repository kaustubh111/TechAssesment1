<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">

.Products{
margin: 100px 20px 30px 450px;
}
</style>
<title>Add Products</title>
</head>
<body>
<div class="Products">
<form action="Addproduct" method="post">
Name <input type="text">
<br><br>
Price <input type="number">
<br><br>
Category <select><option>A</option><option>B</option><option>C</option></select>
<br><br>
<button type="submit">Submit</button>
<button type="reset">Clear</button>
</form>
</div>

</body>
</html>