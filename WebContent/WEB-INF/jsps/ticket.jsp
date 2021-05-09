<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<c:import url="header.jsp" />
 
 
 <BR>
<%-- JSTL: JSP Std Tag Library : EL--%>

<div class="container-fluid ml-4">
 <table id="example" class="ui celled table" style="width:100%">
        <thead>
            <tr>
                <th>Created Date</th>
                <th>Status</th>
                <th>Description</th>
                <th>ActionTaken</th>
                <th>Executive</th>
                <th>Customer Email</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="t">
            <tr>
                <td><c:out value="${t.createdDate }" /></td>
                <td><c:out value="${t.status }" /></td>
                <td><c:out value="${t.description }" /></td>
                <td><c:out value="${t.actionTaken }" /></td>
                <td><c:out value="${t.executive.name }" /></td>
                <td><c:out value="${t.customer.email }" /></td>
                
            </tr>
            </c:forEach>
          
        </tfoot>
    </table>
     </div>
    <script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
    </script>



<c:import url="footer.jsp" />
</body>
</html>




