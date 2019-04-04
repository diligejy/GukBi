package com.board.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.board.biz.BoardBiz;
import com.board.vo.BoardVo;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.activation.CommandMap;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.board.biz.BoardBiz;

@Controller
public class BoardController {

	@Autowired
	private BoardBiz boardBiz;

	@RequestMapping(value = "/board.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView openBoardList() throws Exception {
		List<BoardVo> list = boardBiz.getcontentAll();

		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/Board.jsp");// 이동할 페이지 지정
		mav.addObject("list", list); // 데이터 저장
		return mav; // 페이지 이동(출력)
	}

	@RequestMapping(value = "/readcontent.do", method = RequestMethod.GET)
	public ModelAndView readBoardList(@RequestParam("no") int no) throws Exception {
		BoardVo result = boardBiz.readContent(no);
		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/BoardContent.jsp"); // 이동할 페이지 지정
		mav.addObject("result", result);
		return mav;
	}

	@RequestMapping(value = "/boardwrite.do")
	public ModelAndView writeBoard() throws Exception {
		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/BoardWrite.jsp");
		return mav;
	}

	@RequestMapping(value = "/insertcontent.do", method = RequestMethod.GET)
	public ModelAndView insertBoardList(@ModelAttribute BoardVo vo) throws Exception {


		List<BoardVo> list = boardBiz.getcontentAll();
		ModelAndView mav = new ModelAndView("board.do"); // 이동할 페이지 지정
		mav.addObject("list", list);
		return mav;
	}

//find.do -> 결과를 update
	//
	@RequestMapping(value = "/updatecontent.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView updateBoardList(@RequestParam int no) throws Exception {
		BoardVo result = boardBiz.readContent(no);
		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/BoardUpdate.jsp"); // 이동할 페이지 지정
		mav.addObject("result", result);
		return mav;
	}

	@RequestMapping(value = "/updatefinish.do")
	public ModelAndView updatefinish(@ModelAttribute BoardVo vo) throws Exception {
		int result = boardBiz.getUpdate(vo);
		List<BoardVo> list = boardBiz.getcontentAll();
		ModelAndView mav = new ModelAndView("board.do"); // 이동할 페이지 지정
		mav.addObject("list", list);
		return mav;

	}

	@RequestMapping(value = "/deletecontent.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteBoardList(@RequestParam("no") int no) throws Exception {
		int result = boardBiz.getDelete(no);
		return "/board.do";
	}

	@RequestMapping(value = "/replyall.do") // 댓글 보기
	public ModelAndView replyall() throws Exception {
		List<BoardVo> li = boardBiz.getReplyAll();
		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/Reply_All.jsp");
		mav.addObject("li", li); // 데이터 저장
		return mav;
	}

	@RequestMapping(value = "/replywrite.do") // 댓글 작성
	public ModelAndView replywrite() throws Exception {
		ModelAndView mav = new ModelAndView("/WEB-INF/View/Board/Reply_Write.jsp");
		return mav;
	}

	
	@RequestMapping(value = "/replyinsert.do", method = { RequestMethod.GET, RequestMethod.POST }) // 댓글 쓰기 
	public ModelAndView replyinsert(@RequestParam("no") int no, @ModelAttribute BoardVo boardVo) throws Exception{
		List<BoardVo> list = boardBiz.getReplyAll();
		BoardVo result = boardBiz.readContent(no);
		ModelAndView mav = new ModelAndView("/readcontent.do"); // 이동할 페이지 지정
		mav.addObject("list", list);
		mav.addObject("result", result);
		return mav;
			
	}
}