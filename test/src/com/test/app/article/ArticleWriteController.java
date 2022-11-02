package com.test.app.article;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.app.Execute;
import com.test.app.Result;
import com.test.app.article.dao.ArticleDAO;
import com.test.app.article.vo.ArticleVO;

public class ArticleWriteController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		ArticleVO vo = new ArticleVO();
		ArticleDAO dao = new ArticleDAO();
		Result result = new Result();
		
		HttpSession session = req.getSession();
		int memberNumber = (int)session.getAttribute("memberNumber");
		
		// 카테고리 추가 필요
		vo.setTitle(req.getParameter("title"));
		vo.setContent(req.getParameter("content"));
		vo.setMemberNumber(memberNumber);
		
		System.out.println(vo.toString());
		
		dao.write(vo);
		
		result.setRedirect(true);
		result.setPath("/member/mypage.me");
		return result;
	}
}
