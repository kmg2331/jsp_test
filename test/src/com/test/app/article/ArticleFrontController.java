package com.test.app.article;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.app.Result;

public class ArticleFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// req.getContextPath : The path starts with a "/" character but does not end with a "/"character.
		String target = req.getRequestURI().substring(req.getContextPath().length());
		Result result = null;
		req.setCharacterEncoding("UTF-8");
		
		if(target.equals("/article/write.at")) {
			System.out.println("게시글 작성 중");
			result = new ArticleWriteController().execute(req, resp);
			System.out.println("게시글 작성 완료");
		} else if(target.equals("/article/getList.at")) {
			result = new ArticleGetListController().execute(req, resp);
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
