import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlsession {

	public static SqlSessionFactory sqlSessionFactory;
	static {
		//톰캣을 실행하면 이부분을 먼저 실행함.
		String resouce = "/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resouce);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession(true);
	}
	
}
































