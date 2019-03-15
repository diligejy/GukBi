package service;

import java.util.List;
import java.util.Map;

import data.MemberDTO;

public interface MemberService {
	int insertMember(MemberDTO dto);
	List<MemberDTO> getList(Map<String, String> map);
	MemberDTO getMember(String member);
	int updateMember(MemberDTO dto);
	int deleteMember(String member);
}
