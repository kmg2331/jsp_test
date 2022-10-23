<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP example01</title>
</head>
<body>
<%
	java.util.Random randomNum = new java.util.Random();

	int total = 0;
	for(int i=0;i<=randomNum.nextInt(10);i++){
		System.out.println("처리됨");
		total += i;
	}
%>
<h1>1부터 10까지의 합: <%= total %></h1>
</body>
</html>