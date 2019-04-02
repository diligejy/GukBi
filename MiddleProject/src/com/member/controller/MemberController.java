package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.member.biz.MemberBiz;
import com.member.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	MemberBiz memberbiz;

	// 1.ÀüÃ¼Ãâ·Â
	@RequestMapping("/select.do")
	public String my_select(Model m) {
		List<MemberVo> all = memberbiz.getAll();
		m.addAttribute("all", all);
		return "listScore";
	}
	
//	@RequestParam("del_name")
	@RequestMapping("/delete.do")
	public String my_delete(String del_name) {
		int res = memberbiz.getDelete(del_name);
		if (res > 0)
			return "/select.do";
		return "";
	}

	@RequestMapping("/show/member.do")
	public String InsertView() {
		
		return "/WEB-INF/show/member.jsp";
	}

	@RequestMapping("/insert.do")
	public String MyInsert(@ModelAttribute("member")MemberVo memberVo) {
		System.out.println(memberVo.getId());
		
		int r = memberbiz.getInsert(memberVo);
		return "";
	}
	
	@RequestMapping("/update.do")
	public String MyUpdate(@ModelAttribute("member") MemberVo memberVo) {
		System.out.println(memberVo.getId());
		
		int r = memberbiz.getUpdate(memberVo);
		return "";

	}
}
