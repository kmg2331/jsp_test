<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본 문법</title>
</head>
<body>
<h1>JSP 기본 문법 예제</h1>
<%
	//Scriptlet: 자바코드를 작성할 수 있는 영역(연산, 처리 기능 정의)
	String str = "This is Scriptlet";
	String comment = "주석";
%>
<h2>
	선언문: <%= declration %> <!-- 표현식: 값을 출력하는 부분 (=)-->
</h2>
<ul>
	<li><%= str %></li>
	<li><%= comment %></li>
</ul>
<%!
	String declration = "선언문";
%>
</body>
</html>