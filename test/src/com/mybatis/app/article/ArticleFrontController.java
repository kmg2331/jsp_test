package com.mybatis.app.article;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.app.Result;

@WebServlet("/article")
public class ArticleFrontController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post 실행");
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String target = req.getRequestURI().substring(req.getContextPath().length());
		Result result = null;
		
		System.out.println(target);
		
		if(target.equals("/article.write")) {
			result = new Result();
			result.setPath("/app/article/write.jsp");
			resp.sendRedirect(result.getPath());
			
		} else if (target.equals("/article/writeOK")) {
			ArticleWriteController contr = new ArticleWriteController();
			result = contr.execute(req, resp);
			result.setPath("");
		}
	}
	
	/*
	 * 프로젝트 Path만 가져옵니다. request.getContextPath()  예)
	 *  http://localhost:8080/project/list.jsp 
	 * [return] /project    
	 * 
	 * 프로젝트 + 파일경로까지 가져옵니다. 
	 * request.getRequestURI() 
	 * 예)  http://localhost:8080/project/list.jsp
	 * [return] /project/list.jsp   
	 * String url = request.getRequestURI.split("/"); String Name = url[url.length -1];
	 * --> list.jsp
	 */
	}
