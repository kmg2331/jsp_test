<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Map<String, String[]> paramMap = request.getParameterMap();
		HashMap<String, String> userVO = new HashMap<String, String>();
		
		for(Map.Entry<String, String[]> entry : paramMap.entrySet()){
			userVO.put(entry.getKey(), entry.getValue()[0]);
		}
		
		System.out.println(userVO);
	%>
</body>
</html>