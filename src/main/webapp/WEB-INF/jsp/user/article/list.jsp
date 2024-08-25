<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="${board.code } LIST"></c:set>
<%@ include file="../common/head.jspf"%>

<hr />

<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>Registration Date</th>
			<th>TITLE</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach var="article" items="${articles}">
			<tr>
				<td>${article.id }</td>
				<td>${article.regDate.substring(0,10)}</td>
				<td>${article.title }</td>

			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>