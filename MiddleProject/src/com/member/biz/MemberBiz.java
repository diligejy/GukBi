package com.member.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.member.dao.MemberDaoImpl;
import com.member.vo.MemberVo;

public class MemberBiz {

	@Autowired
	MemberDaoImpl memberDaoImpl;

	public List<MemberVo> getAll() {

		return memberDaoImpl.getAll();
	}

	public int getDelete(String del_name) {

		return memberDaoImpl.getDelete(del_name);
	}

	public int getInsert(MemberVo id) {
		return memberDaoImpl.getInsert(id);
	}

	public List<MemberVo> getFind(String id) {
		return memberDaoImpl.getFind(id);
	}

	public int getUpdate(MemberVo id) {
		return memberDaoImpl.getUpdate(id);
	}
	
	 public MemberVo getLog(MemberVo memberVo) {
		   return memberDaoImpl.getLog(memberVo);
	   }
}
