package com.test.app.member;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.app.Execute;
import com.test.app.Result;
import com.test.app.member.dao.MemberDAO;
import com.test.app.member.vo.MemberVO;

public class MemberJoinController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		Result result = new Result();
		
		vo.setMemberId(req.getParameter("memberId"));
		vo.setMemberPw(req.getParameter("memberPw"));
		
		
		if(dao.join(vo)) {
			System.out.println("회원가입 성공!");
			result.setPath("/member/mypage.me");
			result.setRedirect(true);
			req.setAttribute("memberNumber", dao.lastJoinMemberNumber());
		}
		else {
			System.out.println("회원가입 실패. 중복된 아이디.");
			result.setPath("/member/join.me");
			result.setRedirect(true);
		}
		
		return result;
	}
}
