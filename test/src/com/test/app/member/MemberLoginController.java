package com.test.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		int memberNumber = dao.login(vo);
		if(memberNumber == 0) {
			System.out.println("로그인 실패!");
			result.setPath("index.jsp");
			result.setRedirect(true);
		} else {
			req.setAttribute("memberNumber", memberNumber);
			System.out.println("로그인 성공!");
			result.setRedirect(true);
			result.setPath("/member/mypage.me");
		}
		return result;
	}
}
