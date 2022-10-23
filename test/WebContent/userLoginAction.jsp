<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserVO"%>
<%@ page import="user.UserDAO"%>
<%@ page import= "java.io.PrintWriter" %>

<%
	request.setCharacterEncoding("utf-8");
	String userID = request.getParameter("userID");
	String userPW = request.getParameter("userPW");
	PrintWriter script = response.getWriter();
	
	if(userID == null || userPW == null){
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
	
	UserDAO userDAO = new UserDAO();
	UserVO userVO = userDAO.login(userID, userPW);
	
	if(userVO == null){
		script.println("<script>");
		script.println("alert('로그인 실패.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
	
	session.setAttribute("userVO", userVO);
	RequestDispatcher rd = request.getRequestDispatcher("userPage.jsp");
	rd.forward(request, response);
%>