<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals("kmg2331")){
		if(!pw.equals("1234")){
	%>	
		비밀번호 확인.
	<% return;} %>
		로그인 성공.
	<%return; } %>
		아이디 확인.
</body>
</html>