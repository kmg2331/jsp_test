package com.test.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.app.Result;
import com.test.app.member.MemberJoinController;

public class MemberFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String target = req.getRequestURI().substring(req.getContextPath().length());
		Result result = null;
		
		if(target.equals("/member/mypage.me")) {
			result = new Result();
			result.setPath("/app/member/mypage.jsp");
		}
		else if(target.equals("/member/join.me")) {
			result = new Result();
			result.setPath("/app/member/join.jsp");
		}
		else if(target.equals("/member/joinOk.me")) {
			result = new MemberJoinController().execute(req, resp);
			HttpSession session = req.getSession(true);
			session.setAttribute("memberNumber", req.getAttribute("memberNumber"));
		}
		else if (target.equals("/member/login.me")) {
			result = new MemberLoginController().execute(req, resp);
			HttpSession session = req.getSession(true);
			session.setAttribute("memberNumber", req.getAttribute("memberNumber"));
		}
		else if (target.equals("/member/myarticle.me")) {
			System.out.println("게시글 목록 접속 중");
			result = new Result();
			result.setPath("/article/getList.at");
		}
		else if (target.equals("/member/myarticle_load.me")) {
			System.out.println("게시글 목록 불러오기 완료");
			result = new Result();
			result.setPath("/app/member/myarticle.jsp");
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
			
		}
	}
}
