<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex04_result.jsp">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="text" name="pw" placeholder="비밀번호"><br>
		<input type="text" name="name" placeholder="이름"><br>
		<input type="text" name="age" placeholder="나이"><br>
		<input id="confirm" type="submit" value="확인">
	</form>
</body>
<script type="text/javascript" src="">
	var con = document.getElementById("confirm");
	con.onclick = function(){
		alert("확인");
	}
</script>
</html>