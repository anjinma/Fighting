<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td{
border: 1px solid gray;
padding:10px;
}
</style>
</head>
<body>
<div><a href="/member/login">로그인</a></div>
	<div>
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>아이디</td>
				<td>메일</td>
			</tr>
			<c:forEach var="result" items="${list }">
				<tr>
					<td>${result.mno }</td>
					<td>${result.name }</td>
					<td>${result.id }</td>
					<td>${result.email }</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>