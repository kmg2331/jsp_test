package com.mybatis.app.article;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.app.Execute;
import com.mybatis.app.Result;
import com.mybatis.app.article.dao.ArticleDAO;

public class ArticleWriteController implements Execute{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		Result result = new Result();
		
		ArticleDAO articleDAO = new ArticleDAO();
		articleDAO.insertAll(req.getParameterMap());
		
		result.setRedirect(false);
		return result;
	}
}
