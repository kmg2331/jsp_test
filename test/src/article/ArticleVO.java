package article;

import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ArticleVO {
	
	public int id, 
		type,
		outdate,
		category,
		viewCount;
	
	public String title,
			content;
	public LocalDateTime wrritenDate;

	public ArticleVO() {;}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
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

	public LocalDateTime getWrritenDate() {
		return wrritenDate;
	}

	public void setWrritenDate(LocalDateTime wrritenDate) {
		this.wrritenDate = wrritenDate;
	}

//	@Override
//	public String toString() {
//		return "ArticleVO [id=" + id + ", type=" + type + ", outdate=" + outdate + ", category=" + category
//				+ ", viewCount=" + viewCount + ", title=" + title + ", content=" + content + ", wrritenDate="
//				+ wrritenDate + "]";
//	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	
}
