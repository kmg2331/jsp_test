<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="java.util.ArrayList" %>
 <%@ page import="article.ArticleVO" %>
 <%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("utf-8");		
		// 총 게시글 개수
		//int totalPost = arr.size();
		// 1페이지당 10개 게시글 default
		/* int postPerPage = 10;
		int totalPage = totalPost / postPerPage + 
					((totalPost % postPerPage)==0 ? 0 : 1);
			
		int arrIndex = 0; */
		/* out.println("<ul style=\"list-style-type:none;\">게시글 목록 리스트");
		while(arrIndex < arr.size()){
			out.println("<li>");
			out.print(arr.get(arrIndex).getId() + "--");
			out.print("제목 : " + arr.get(arrIndex).getTitle() + "--");
			out.print(arr.get(arrIndex).getContent() + "--");
			out.println("</li>");
			arrIndex++;
		}
		out.println("</ul>");
		out.close(); */
	%>
	 <ul>
		<c:forEach var="arr" items="${articles}">
			<li>${ arr }</li>
		</c:forEach>
	 </ul>
</body>
</html>