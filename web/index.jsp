<%--
  Created by IntelliJ IDEA.
  User: feltzshae
  Date: 2019-04-11
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--Lance Graham
IT 214 Section 01
Group Project-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Math Portal</title>
</head>
<body>
<!-- These are the hyperlinks, and they are on the index page. The user will click a hyperlink to call a specific servlet. -->
<h4>
    <a href="${pageContext.request.contextPath}/index.jsp">[Home]</a>
	<a href="${pageContext.request.contextPath}/RecursiveAdd.jsp">[Triangular Number Calculator]</a>
	<a href="${pageContext.request.contextPath}/RecursiveMult.jsp">[Factorial Calculator]</a>
    <a href="${pageContext.request.contextPath}/BinarySearch.jsp">[Binary Search]   </a>
	<a href="${pageContext.request.contextPath}/Calculator.jsp">[Simple Math Calculator]</a>
	<a href="${pageContext.request.contextPath}/Queue.jsp">[Queue Implementation]</a>
</h4>

<h1>Cool Math Implementations</h1>
<img src="https://s3.amazonaws.com/www.mathnasium.com/upload/831/images/Math.jpg" style="width: 400px;"/>
<!-- image -->
</body>
</html>