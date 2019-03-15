package dao;

import java.util.List;
import java.util.Map;

import data.MemberDTO;

public interface MemberDAO {
	int insertMember(MemberDTO dto) throws Exception;

	List<MemberDTO> getList(Map<String, String> map);

	MemberDTO getMember(String member);

	int updateMember(MemberDTO dto);

	int deleteMember(String member);

}
