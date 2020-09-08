<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table>
	<tr>
		<td>Id</td>
		<td>Project Name</td>
		<td>View</td>
	</tr>


	<c:forEach var="p" items="${list}">

		<tr>
			<td>${p.id}</td>
			<td>${p.name}</td>
			<td><a href="view/${p.id}">View</a></td>
		</tr>
	</c:forEach>
</table>