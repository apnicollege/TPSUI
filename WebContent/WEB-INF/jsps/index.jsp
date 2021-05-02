<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
 
<body>
<c:import url="header.jsp" />
<h1>Home</h1>
<a href="${pageContext.request.contextPath }/ticket"> Tickets </a>
<c:import url="footer.jsp" />
</body>
</html>