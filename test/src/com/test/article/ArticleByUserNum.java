package com.test.article;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import article.ArticleDAO;
import article.ArticleVO;

/**
 * Servlet implementation class articleByUserNum
 */

public class ArticleByUserNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleByUserNum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int userNumber = (int) session.getAttribute("userNumber");
		
		ArticleDAO articleDAO = new ArticleDAO();
		ArrayList<ArticleVO> arr = new ArrayList<ArticleVO>();
		arr = articleDAO.getArticlesByUserNum(userNumber);
		
		request.setCharacterEncoding("utf-8");
		request.setAttribute("articles", arr);
		RequestDispatcher rd = request.getRequestDispatcher("article.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
