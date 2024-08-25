<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="${board.code } DETAIL"></c:set>
<%@ include file="../common/head.jspf"%>

<hr />

<body class="bg-gray-50 p-8">
	<div class="mt-20 max-w-4xl mx-auto bg-white shadow-2xl rounded-lg border border-gray-200 p-8">
		<h2 class="text-4xl font-extrabold text-gray-900 mb-6">게시글 상세보기</h2>
		<div class="mb-6">
			<p class="text-gray-600 text-sm mb-2">
				게시글 ID:
				<span class="font-medium text-gray-800">${article.id}</span>
			</p>
			<p class="text-gray-600 text-sm mb-2">
				등록일:
				<span class="font-medium text-gray-800">${article.regDate.substring(0,10)}</span>
			</p>
			<h3 class="text-2xl font-semibold text-gray-900 mt-4 mb-2">
				제목:
				<span class="font-medium text-gray-800">${article.title}</span>
			</h3>
			<p class="text-gray-600 text-sm mb-2">
				내용:
				<span class="font-medium text-gray-800">${article.body}</span>
			</p>
		</div>

	</div>
	<%@ include file="../common/foot.jspf"%>