package com.member.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.inter.SqlInter;
import com.member.vo.MemberVo;

public class MemberDaoImpl implements MemberDao, SqlInter {

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
	}

	@Override
	public List<MemberVo> getAll() {
		SqlSession session = factory.openSession();
		List<MemberVo> all = null;
		try {
			all = session.selectList("memberMapper.view");
			System.out.println(all.size());

		} finally {
			session.close();
		}
		return all;
	}

	@Override
	public int getInsert(MemberVo memberVo) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("memberMapper.memberInsert", memberVo);

			if (all > 0) {
				session.commit();
			}
		} catch (Exception e) {
			e.fillInStackTrace();
			session.rollback();

		} finally {
			session.close();
		}
		return all;
	}

	@Override
	public int getDelete(String del_name) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.delete("memberMapper.memberDelete", del_name);
			if (all > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.fillInStackTrace();

		} finally {
			session.close();
		}
		return all;
	}

	@Override
	public int getUpdate(MemberVo memberVo) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.update("memberMapper.memberUpdate", memberVo);
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

	@Override
	public List<MemberVo> getFind(String id) {
		SqlSession session = factory.openSession();
		List<MemberVo> all = null;

		try {

			all = session.selectList("memberMapper.memberFind", id);

		} finally {
			session.close();
		}

		return all;
	}

	@Override
	public MemberVo getLog(MemberVo memberVo) {
		SqlSession session = factory.openSession();
		   MemberVo all = null;
		   try {
			   all=session.selectOne("memberMapper.memberLog", memberVo);
			   
		   }catch(Exception e) {
			   System.out.println("로그인 실패");
			   e.printStackTrace();
		   }finally {
			   session.close();
		   }
		   return all;
	}

	@Override
	public MemberVo getPwcheck(MemberVo memberVo) {
		SqlSession session = factory.openSession();
		   MemberVo all = null;
		   try {
			   all=session.selectOne("memberMapper.memberPwcheck", memberVo);
			   
		   }catch(Exception e) {
			   System.out.println("비번찾기 실패");
			   e.printStackTrace();
		   }finally {
			   session.close();
		   }
		   return all;
	}

}
