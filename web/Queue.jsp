<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Queue Implementation</title>
</head>
<body>

<h4>
	<a href="${pageContext.request.contextPath}/index.jsp">[Home]   </a>
	<a href="${pageContext.request.contextPath}/RecursiveAdd.jsp">[Triangular Number Calculator]   </a>
	<a href="${pageContext.request.contextPath}/RecursiveMult.jsp">[Factorial Calculator]   </a>
    <a href="${pageContext.request.contextPath}/BinarySearch.jsp">[Binary Search]   </a>
	<a href="${pageContext.request.contextPath}/Calculator.jsp">[Simple Math Calculator]</a>
</h4>

<form action="QUEUE" method="post">
    <!-- This is a form to capture the user's integer input for the queue,they are saved as strings  -->
    <h1>Queue implementation with reused methods.</h1>
    Enter the numbers that you want to put into the queue. Separate them by a comma.<input type="text"
                                                                                           name="numbers"/><br/>
    <input type="submit" value="Submit"/>
</form>
<img src="https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/02/Queue.png" style="width: 600px;"/>
</body>
</html>