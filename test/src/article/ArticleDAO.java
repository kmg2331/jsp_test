package article;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.JDBCutil;

public class ArticleDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	JDBCutil jdbcUtil = null;
	
	public ArticleDAO() {
		this.jdbcUtil = new JDBCutil();
	}

	public void addViewCount(int articleID) {
		String query = "update tbl_viewCount set view_count = view_count + 1 "
				+ "where id = ?";
		
		try {
			conn = jdbcUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, articleID);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<ArticleVO> getArticlesByUserNum(int num) {
		String query = "select a.title, a.content, a.outdate, a.category, v.view_count, v.like_count \r\n"
				+ "from tbl_article a, tbl_viewcount v\r\n"
				+ "where a.id = v.article_id  \r\n"
				+ "and a.user_number = ? ";
		
		ArrayList<ArticleVO> result = new ArrayList<ArticleVO>();
		
		try {
			
			conn = jdbcUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ArticleVO temp = new ArticleVO();
				temp = new ArticleVO();
				temp.setTitle(rs.getString(1));
				temp.setContent(rs.getString(2));
				temp.setOutdate(rs.getInt(3));
				temp.setCategory(rs.getInt(4));
				temp.setViewCount(rs.getInt(5));
				//result.setLikeCount(rs.getInt(6)); // 나중에 추가
				result.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
	public ArticleVO getArticleById(int articleID) {
		String query = "select a.title, a.content, a.outdate, a.category, v.view_count, v.like_count \r\n"
				+ "from tbl_article a\r\n"
				+ "	inner join tbl_viewcount v \r\n"
				+ "	on a.id = v.id "
				+ "where a.id = ?";
		ArticleVO result = null; 
		
		try {
			conn = jdbcUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, articleID);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = new ArticleVO();
				result.setTitle(rs.getString(1));
				result.setContent(rs.getString(2));
				result.setOutdate(rs.getInt(3));
				result.setCategory(rs.getInt(4));
				result.setViewCount(rs.getInt(5));
//				result.setLikeCount(rs.getInt(6)); // 나중에 추가
				
			} else {System.out.println("게시글을 찾을 수 없습니다."); }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public void insertArticle(ArticleVO vo, int userNum) {
		String query = "insert into tbl_article "
				+ "(outdate, category, title, content, written_date, user_number) "
				+ "values(?, ?, ?, ?, ?, ?)";
		
//		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		
		try {
			conn = jdbcUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, vo.getOutdate());
			ps.setInt(2, vo.getCategory());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getContent());
			java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
			ps.setDate(5, now);
			ps.setInt(6, userNum);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}