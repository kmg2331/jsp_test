<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<form action="userJoinAction.jsp" method="post">
		<input type="text" name="userID" placeholder="id">
		<input type="text" name="userPW" placeholder="pw">
		<input type="submit" value="회원가입">
	</form>
	<br>
	<form action="Login" method="post">
		<input type="text" name="userID" placeholder="id">
		<input type="text" name="userPW" placeholder="pw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>