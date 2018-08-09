<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>${ title1 }</title>
</head>
<body>
	<h3>${ requestScope.driver.name } ${ requestScope.driver.firstname }</h3>
	
	<p>Un conducteur</p>
	<p>Agé de ${ requestScope.driverAge } ans</p>
	<c:out value="hee"/>
</body>
</html>