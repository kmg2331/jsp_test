package com.test.app.article.vo;

public class ArticleDTO {
	private int id;
	private int outdate;
	private int category;
	private String title;
	private String content;
	private String userId;
	private String writtenTime;
	private int viewcount;
	private int likecount;
	
	public ArticleDTO() {;}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOutdate() {
		return outdate;
	}
	public void setOutdate(int outdate) {
		this.outdate = outdate;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWrittenTime() {
		return writtenTime;
	}
	public void setWrittenTime(String writtenTime) {
		this.writtenTime = writtenTime;
	}
	public int getViewCount() {
		return viewcount;
	}
	public void setViewCount(int viewcount) {
		this.viewcount = viewcount;
	}
	public int getLikeCount() {
		return likecount;
	}
	public void setLikeCount(int likecount) {
		this.likecount = likecount;
	}

	@Override
	public String toString() {
		return "ArticleDTO [id=" + id + ", outdate=" + outdate + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", userId=" + userId + ", writtenTime=" + writtenTime
				+ ", viewCount=" + viewcount + ", likeCount=" + likecount + "]";
	}
	
}
