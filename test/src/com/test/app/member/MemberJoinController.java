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
		
		vo.setMemberId(req.getParameter("memberId"));
		vo.setMemberPw(req.getParameter("memberPw"));
		
		MemberDAO dao = new MemberDAO();
		dao.join(vo);
		
		System.out.println("result 객체 생성 완료.");
		Result result = new Result();
		result.setPath("mypage.me");
		result.setRedirect(true);
		
		return result;
	}
}
