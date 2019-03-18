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

	// insert
	public int getInsert(Product pro) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("ProductMapper.productInsert", pro);
			if (all > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		return all;
	}

	// delete
	public int getDelete(int no) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.delete("ProductMapper.productDelete", no);
			if (all > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		return all;
	}
	// update (= insert)
	public int getUpdate(Product pro) { //no로 찾아서 price를 바꿔라. 
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("ProductMapper.productUpdate", pro);
			if (all > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		return all;
	}
}
