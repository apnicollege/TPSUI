<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- import tag -->
 <%@ page import="java.time.LocalDate" %>   
 <%@ page import="java.util.List" %> 
 <%@ page import="com.tpsui.beans.Ticket" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ticket</h1>
<!--  Scriptlet -->
<% 
	int x=5;
	int y=6;
	
%>
<!--  expression tag -->
Output= <%=x+y %>
<%= LocalDate.now() %>
<%-- JSP Comment --%>
<hr>
<% 
	List<Ticket> list = (List<Ticket>) request.getAttribute("list");
%>
<%=list %>

</body>
</html>




