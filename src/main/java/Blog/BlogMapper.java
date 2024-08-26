package Blog;

import java.util.List;

public interface BlogMapper {
	List<BlogDTO> selectBlogs();
	BlogDTO selectBlog(int id);
	int registerBlog(BlogDTO blog);
	int modifyBlog(BlogDTO blog);
	int removeBlog(int id);
	
	//첨부파일 저장
	int insertFile(List<BlogDTO>blog);
}
