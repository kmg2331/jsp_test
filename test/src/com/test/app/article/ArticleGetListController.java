package com.test.app.article;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.app.Execute;
import com.test.app.Result;
import com.test.app.article.dao.ArticleDAO;
import com.test.app.article.vo.ArticleDTO;

public class ArticleGetListController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		ArticleDAO dao = new ArticleDAO();
		Result result = new Result();
		
		int memberNumber = (int) req.getSession().getAttribute("memberNumber");
		
		List<ArticleDTO> list = dao.selectByMemberNumber(memberNumber);
		req.setAttribute("selectedArticles", list);
		
		result.setPath("/member/myarticle_load.me");
		return result;
	}
}
