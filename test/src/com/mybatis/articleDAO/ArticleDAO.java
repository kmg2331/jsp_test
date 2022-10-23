package com.mybatis.articleDAO;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

import article.ArticleVO;

public class ArticleDAO {
	
	public List<Object> insertArticle(ArticleVO vo, int userNum){
		
		// values(#{category}, #{title}, #{content}, #{date}, #{userNum})
		HashMap<String, Object> pram = new HashMap<String, Object>();
		pram.put("category", vo.getCategory());
		pram.put("title", vo.getTitle());
		pram.put("content", vo.getContent());
		pram.put("date", vo.getWrritenDate());
		pram.put("userNum", userNum);
		
		SqlSession session = MyBatisConfig.getsqlSessionFactory().openSession();
		List<Object> result = session.selectList("insertVo", pram);
		return result;
		/*
		HttpSession session = request.getSession();
		int userNumber = (int) session.getAttribute("userNumber");
		
		ArticleDAO articleDAO = new ArticleDAO();
		ArrayList<ArticleVO> arr = new ArrayList<ArticleVO>();
		arr = articleDAO.getArticlesByUserNum(userNumber);
		
		request.setCharacterEncoding("utf-8");
		request.setAttribute("articles", arr);
		RequestDispatcher rd = request.getRequestDispatcher("article.jsp");
		rd.forward(request, response);
		 */
	}
}
