package com.test.article;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import article.ArticleDAO;
import article.ArticleVO;
import user.UserDAO;
import user.UserVO;

/**
 * Servlet implementation class viewUserArticle
 */
@WebServlet("/ViewArticles")
public class ViewUserArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUserArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int userNumber = Integer.parseInt((String)session.getAttribute("userNumber"));
		//String result = "hello";
		
		ArticleDAO articleDAO = new ArticleDAO();
		ArticleVO vo = articleDAO.getArticleById(userNumber);
		
		request.setAttribute("articleVO", vo);
		request.setAttribute("result", vo.toString());
		RequestDispatcher rd = request.getRequestDispatcher("article.jsp");
		rd.forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}