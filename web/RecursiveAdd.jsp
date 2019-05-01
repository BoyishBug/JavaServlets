<!-- By Lance Graham // Updated by Shae Feltz
IT 214 Section 01
Group Project-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Triangle Number (Recursive Addition)</title>
</head>
<body>

<h4>
    <a href="${pageContext.request.contextPath}/index.jsp">[Home]</a>
    <a href="${pageContext.request.contextPath}/RecursiveAdd.jsp">[Triangular Number Calculator]</a>
    <a href="${pageContext.request.contextPath}/RecursiveMult.jsp">[Factorial Calculator]</a>
    <a href="${pageContext.request.contextPath}/BinarySearch.jsp">[Binary Search and Sort]   </a>
    <a href="${pageContext.request.contextPath}/Calculator.jsp">[Simple Math Calculator]</a>
    <a href="${pageContext.request.contextPath}/Queue.jsp">[Queue Implementation]</a>
</h4>

<form action="recursiveADD" method="post">
    <!-- This is a form to capture the user's integer input. They are saved as strings.-->
    <h1>Find any triangular number using this calculator!</h1>
    Your Number: <input type="text" name="number1"/><br/>
    <br/>
    <input type="submit" value="Find Your Triangular Number"/>
</form>
<h1></h1>
<img src="http://mathandmultimedia.com/wp-content/uploads/2010/08/gauss1.png" style="width: 400px;"/>
</body>
</html>