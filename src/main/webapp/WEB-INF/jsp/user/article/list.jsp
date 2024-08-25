<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="${board.code } LIST"></c:set>
<%@ include file="../common/head.jspf"%>

<hr />

<div class="overflow-x-auto">
	<table class="min-w-full bg-white shadow-md rounded-lg border border-gray-200">
		<thead class="bg-blue-300 ">
			<tr>
				<th class="py-3 px-6 text-left">ID</th>
				<th class="py-3 px-6 text-left">Registration Date</th>
				<th class="py-3 px-6 text-left">TITLE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="article" items="${articles}">
				<tr class="border-b border-gray-200 hover:bg-gray-100">
					<td class="py-3 px-6 text-sm text-gray-800">${article.id}</td>
					<td class="py-3 px-6 text-sm text-gray-600">${article.regDate.substring(0,10)}</td>
					<td class="py-3 px-6 text-sm text-gray-800"><a href="detail?id=${article.id}">${article.title}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../common/foot.jspf"%>