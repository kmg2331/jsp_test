<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<form action="join.me" method="post">
		<input type="text" name="memberId" placeholder="id">
		<input type="text" name="memberPw" placeholder="pw">
		<input type="submit" value="회원가입">
	</form>
	<br>
	<form action="login.me" method="post">
		<input type="text" name="memberId" placeholder="id">
		<input type="text" name="memberPw" placeholder="pw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>