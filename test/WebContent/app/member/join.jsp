<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="/member/joinOk.me">
		<input type="text" name="memberId" placeholder="아이디">
		<input type="password" name="memberPw" placeholder="비밀번호">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>