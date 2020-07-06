package com.simple.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.service.BoardServiceImpl;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
	
	@Autowired
	private BoardServiceImpl boardService;
	
	@Resource(name="boardDAOImpl")
	private BoardDAO boardDAO;
	//화면처리
	@RequestMapping("/boardRegister")
	public void boardRegist() {
		
	}
	//게시글 등록요청
	@RequestMapping("/boardForm")
	public String boardForm(BoardVO vo) {
		
		boardService.boardRegist(vo);
		
		return "service/boardResult";
	}
	//글 리스트
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		return "service/boardList";
	}
	
	//삭제
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num,
			RedirectAttributes RA
			) {
		boardService.boardDelete(num);
		RA.addFlashAttribute("num", num);
		return "redirect:/service/boardList";
	}
}
