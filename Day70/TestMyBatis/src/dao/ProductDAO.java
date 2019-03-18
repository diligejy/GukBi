package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import entity.*; // List<Product>

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ProductDAO {
	static SqlSessionFactory factory;
	static {
		String resource = "conf/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// static end

	public List<Product> getAll() {
		SqlSession session = factory.openSession();
		List<Product> all = null;
		try {
			all = session.selectList("ProductMapper.productAll");
		} finally {
			session.close();
		}
		return all;
	}

}
