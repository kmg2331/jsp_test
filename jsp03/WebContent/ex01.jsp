<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>Client IP: <%= request.getRemoteAddr() %></li>
		<li>요청정보 길이:<%= request.getContentLength() %></li>
		<li>요청정보 문서 타입<%= request.getContentType()  %></li>
		<li>요청정보 전송 방식<%= request.getMethod()  %></li>
	</ul>
</body>
</html>