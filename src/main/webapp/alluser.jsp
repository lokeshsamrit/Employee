<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>All Employees</h1>
<table border="1">
	<tr>
		<td>FirstName</td>
		<td>MiddleName</td>
		<td>LastName</td>
		<td>Designation</td>
		<td>Salary</td>
	</tr>
		<c:forEach items="${employee}" var="employee">
			<tr>
				<td>
				<c:out value="${employee.name}"/>
				</td>
				<td><c:out value="${employee.mname}"/></td>
				<td><c:out value="${employee.lname}"/></td>
				<td><c:out value="${employee.designation}"/></td>
				<td><c:out value="${employee.salary}"/></td>
			</tr>
		</c:forEach>
	
</table>