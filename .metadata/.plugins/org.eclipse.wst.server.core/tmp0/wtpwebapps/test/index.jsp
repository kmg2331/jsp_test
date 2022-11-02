<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<form action="member/join.me" method="get">
		<input type="submit" value="회원가입 하기">
	</form>
	<br>
	<form action="member/login.me" method="post">
		<input type="text" name="memberId" placeholder="id">
		<input type="text" name="memberPw" placeholder="pw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>