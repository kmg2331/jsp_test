package util;


//import article.ArticleDAO;
import article.ArticleVO;
import user.UserDAO;
import user.UserVO;

import com.mybatis.articleDAO.ArticleDAO;

public class TestMain {

	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		UserVO userVO = new UserVO();
		userVO.setUserId("kmg2331");
		userVO.setUserPw("1234");
//		System.out.println(userDAO.joinUser(userVO));
//		System.out.println(userDAO.check("kmg2331"));
//		userVO = userDAO.login("kmg2331", "1234");
//		System.out.println(userVO);

		ArticleVO articleVO = new ArticleVO();
//		ArticleDAO articleDAO = new ArticleDAO();
		articleVO.setTitle("페이징 테스트용");
		articleVO.setContent("테스트용 글 Content");
//		articleVO.setOutdate(0);
//		articleVO.setCategory(0);
//		articleVO.setTitle("Temp Title");
//		articleVO.setContent("Temp Content");
//		LocalDateTime now = LocalDateTime.now();
//		articleVO.setWrritenDate(now);
//		for(int i=0;i < 100;i++) {
//			articleDAO.insertArticle(articleVO, 1);
//		}
		
		ArticleDAO ad = new ArticleDAO();
		ad.insertArticle(articleVO, 1);
		
//		articleDAO.setViewCountService(6);
//		articleDAO.addViewCountService(6);
		
//		System.out.println(userVO.toString());
//		System.out.println(articleDAO.getArticleById(1));
	}
}