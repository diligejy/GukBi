package service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDAOImpl;
import data.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAOImpl memberDao;

	public MemberDAOImpl getMemberDao() {
		return memberDao;
	}

/*	public void setMemberDao(MemberDAOImpl memberDao) {
		this.memberDao = memberDao;
	}*/

	@Override
	public int insertMember(MemberDTO dto) {
		return 0;
	}

	@Override
	public List<MemberDTO> getList(Map<String, String> map) {
		return null;
	}

	@Override
	public MemberDTO getMember(String member) {
		return null;
	}

	@Override
	public int updateMember(MemberDTO dto) {
		return 0;
	}

	@Override
	public int deleteMember(String member) {
		return 0;
	}

}
