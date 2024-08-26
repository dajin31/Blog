package Blog;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BlogService {
	private static BlogService instance = new BlogService();
	private static BlogMapper mapper;

	private BlogService() {
		MySqlsession.getSqlSession();

	}

	public static BlogService getInstance(SqlSession session) {
		mapper = session.getMapper(BlogMapper.class);
		return instance;
	}

	List<BlogDTO> selectBlogs() {
		return mapper.selectBlogs();
	}

	BlogDTO selectBlog(int id) {
		return mapper.selectBlog(id);
	}

	int registerBlog(BlogDTO blog) {
		mapper.registerBlog(blog);
		int BlogId = blog.getId();
		List<BlogDTO> blogList = blog.getBlogList();
		for (BlogDTO blogDTO : blogList) {
			blogDTO.setId(BlogId);
		}

		return mapper.insertFile(blogList);
	}
	
	int modifyBlog(BlogDTO blog) {
		return mapper.modifyBlog(blog);
	}
	
	int removeBlog(int id) {
		return mapper.removeBlog(id);
	}
}