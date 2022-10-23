<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserVO"%>
<%@ page import="user.UserDAO"%>
<%@ page import= "java.io.PrintWriter" %>

<%
	request.setCharacterEncoding("utf-8");
	String userID = request.getParameter("userID");
	String userPW = request.getParameter("userPW");
	
	if(userID == null || userPW == null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
	UserDAO userDAO = new UserDAO();
	UserVO userVO = new UserVO();
	userVO.setUserId(userID);
	userVO.setUserPw(userPW);
	boolean result = userDAO.joinUser(userVO);
	
	if(result){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('회원가입 성공.');");
		script.println("location.href = 'index.jsp'");
		script.println("</script>");
		script.close();
		return;
	}
	if(!result){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('회원가입 실패. 중복된 아이디.');");
		script.println("history.back()");
		script.println("</script>");
		script.close();
		return;
	}
%>