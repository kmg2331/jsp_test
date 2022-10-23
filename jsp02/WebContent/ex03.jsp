<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP life cycle</title>
</head>
<body>
 <%!
 	private int num1 = 0;
 	public void jspInit(){ // 오버라이딩.
 		System.out.println("jspInit() 호출됨.");
 	}
 	
 	public void jspDestory(){ // 오버라이딩.
 		System.out.println("jspDestroy() 호출됨.");
 	}
 %>
 
 <%
 	int num2 = 0;
 	num1++;
 	num2++;
 	if(num1 > 10){
 		num1 = 0;
 	}
 %>
 <ul>
 	<li>num1: <%= num1 %></li>
 	<li>num2: <%= num2 %></li>
 </ul>
</body>
</html>