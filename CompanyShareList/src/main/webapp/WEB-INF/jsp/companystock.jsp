<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.example.demo.entity.Company" %>
<html>
<body>
	<h2>Company Sharelist</h2>


	<table border="1">
	<tr>
		<th>ComanyId</th>
		<th>CompanyName</th>
		<th>SharePrice</th>
		<th>Actions</th>
	</tr>

		<c:forEach var="stock" items="${stock}">
			<tr ${Company}>
				<td>${stock.getCompanyId()}</td>
				<td>${stock.getCompanyName()}</td>
				<td>${stock.getSharePrice()}</td>
				<td><a href="delete-todo?id=${todo.id}" class="btn btn-sm btn-danger">delete a company</a></td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>