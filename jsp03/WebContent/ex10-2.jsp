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
		pageContext.setAttribute("name", "page scope");
		request.setAttribute("name", "value");
		session.setAttribute("name", "session scope");
		application.setAttribute("name", "application scope");
		
		System.out.println("첫 번째 페이지.");
		request.getRequestDispatcher("ex10-3.jsp").forward(request, response);
	%>
</body>
</html>