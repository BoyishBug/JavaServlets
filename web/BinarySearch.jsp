<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Binary Searching and Sorting</title>
</head>
<body>
<h4>
    <a href="${pageContext.request.contextPath}/index.jsp">[Home]</a>
    <a href="${pageContext.request.contextPath}/RecursiveAdd.jsp">[Triangular Number Calculator]</a>
    <a href="${pageContext.request.contextPath}/RecursiveMult.jsp">[Factorial Calculator]</a>
    <a href="${pageContext.request.contextPath}/BinarySearch.jsp">[Binary Search]   </a>
    <a href="${pageContext.request.contextPath}/Calculator.jsp">[Simple Math Calculator]</a>
    <a href="${pageContext.request.contextPath}/Queue.jsp">[Queue Implementation]</a>
</h4>
<form action="binarySEARCH" method="post">
    <h1>Enter the array of numbers and the number being searched for.</h1>
    <!-- This is a form to capture the user's array of ints and the int we are searching for  -->
    Enter the array numbers separated with a comma and no brackets[ ]:<input type="text" name="arr1"/><br/>
    Enter search number:<input type="text" name="number"/><br/>
    <input type="submit" value="Submit"/>
</form>
<h1></h1>
<img src="http://itsfunny.org/wp-content/uploads/2012/12/Funny-horses-search-for..what_.jpg" style="width: 400px;"/>
</body>
</html>
