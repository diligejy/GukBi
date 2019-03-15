package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import data.MemberDTO;
import service.MemberService;

//Controller <-> Biz
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

/*	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}*/

	public int insertMember(MemberDTO dto) {
		return 0;
	}

	List<MemberDTO> getList(Map<String, String> map) {
		return null;
	}
}
