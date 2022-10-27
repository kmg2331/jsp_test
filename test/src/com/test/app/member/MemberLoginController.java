package com.test.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.app.Execute;
import com.test.app.Result;
import com.test.app.member.dao.MemberDAO;
import com.test.app.member.vo.MemberVO;

public class MemberLoginController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		MemberVO vo = new MemberVO();
		vo.setMemberId(req.getParameter("memberId"));
		vo.setMemberPw(req.getParameter("memberPw"));
		
		Result result = new Result();
		
		MemberDAO dao = new MemberDAO();
		if(dao.login(vo)) {
			System.out.println("로그인 성공!");
			result.setPath("mypage.me");
		} else {
			System.out.println("로그인 실패!");
			result.setPath("index.jsp");
			result.setRedirect(true);
		}
		return result;
	}
}
