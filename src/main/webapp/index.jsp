<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어서왕</title>
</head>
<body>
	<strong>어서왕</strong>
	<div>
		<form action="/list.do" method="post">
			<button onclick="submit">목록보기</button>
		</form>
	</div>
	   <div>
        <form action="/login.do" method="post">
            <button onclick="submit">로그인</button>
        </form>
    </div>
</body>
</html>