<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
</head>
<body>
	<h1>게시글 작성</h1>
</body>
	<form action="/article/write.at" method="post">
		게시글 제목<br>
		<input type="text" name="title" placeholder="title"><br>
		<textarea rows="5" cols="50" name="content" style="resize: none;"></textarea>
		<input type="submit" value="입력">
	</form>
	<hr style="border: solid 2px black">
	<form action="/member/myarticle.me" method="post">
		<input type="submit" value="나의 게시글 목록">
	</form>
</html>