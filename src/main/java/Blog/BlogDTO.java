package Blog;

import java.time.LocalDateTime;
import java.util.List;

public class BlogDTO {
	private int id;
	private String title;
	private String content;
	private LocalDateTime registerDate;
	private LocalDateTime modifiedDate;
	
	private List<BlogDTO> blogList;
	
	

	public BlogDTO(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}



	public BlogDTO(int id, String title, String content, LocalDateTime registerDate, LocalDateTime modifiedDate,
			List<BlogDTO> blogList) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.registerDate = registerDate;
		this.modifiedDate = modifiedDate;
		this.blogList = blogList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<BlogDTO> getBlogList() {
		return blogList;
	}

	public void setBlogList(List<BlogDTO> blogList) {
		this.blogList = blogList;
	}

	@Override
	public String toString() {
		return "BlogDTO [id=" + id + ", title=" + title + ", content=" + content + ", registerDate=" + registerDate
				+ ", modifiedDate=" + modifiedDate + ", blogList=" + blogList + "]";
	}
	
	
	
	
}
