package com.test.app.article.vo;

public class ArticleVO {
	private int id;
	private int outdate;
	private int category;
	private String title;
	private String content;
	private int memberNumber;
	
	public ArticleVO() {;}
	
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
	
	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "ArticleVO [id=" + id + ", outdate=" + outdate + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", userNumber=" + memberNumber + "]";
	}

}
