<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
    <c:forEach var="i" items="${styles}">
    <br>
<p>    <c:out value="try: ${i}"/> </p>
</c:forEach>
<br>
<ct:currentDateTime color="red" size="20px"/>
</body>
</html>