package com.member.dao;

import java.util.List;

import com.member.vo.MemberVo;

public interface MemberDao {

	public List<MemberVo> getAll();
	public int getInsert(MemberVo memberVo);
	public int getDelete(String id);
	public int getUpdate(MemberVo memberVo);
	public List<MemberVo> getFind(String id);
	public MemberVo getLog(MemberVo memberVo);
	public MemberVo getPwcheck(MemberVo memberVo);
}
