package com.simple.controller;



import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;
@Controller
@RequestMapping("/service")
public class ScoreController {
	
	//1st 전역변수로 빼줄 수 있다
//	ScoreServiceImpl service = new ScoreServiceImpl();
	
	//2st
//	@Resource(name="scoreService") //이름으로 찾음
//	@Autowired
//	private ScoreService scoreService;
	
	//3st -
	//@Controller, @Service, @Component, @Repository 자동생성 어노테이션을 붙이고,
	//해당패키지를 스캔명령으로 읽어서 반으로 생성후에 자동주입 명령	
	@Autowired
	private ScoreServiceImpl scoreService;
	
	@Resource(name="scoreDAOImpl")
	private ScoreDAO scoreDAO;
	//화면처리
	@RequestMapping("/scoreRegist")
	public void scoreRegist() {
		
	}
	
	//점수등록요청
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
		
		scoreService.scoreRegist(vo);
		  
		System.out.println("score");
		return "service/scoreResult";
	}
	
	//점수화면 요청
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
	ArrayList<ScoreVO> list = scoreService.scoreList();
		
		model.addAttribute("list", list); //화면에 모델전달
		return "service/scoreList";
		
	}
	
	//점수 삭제 요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int num,
			
							 RedirectAttributes RA
			) {
		
		scoreService.scoreDelete(num);
		RA.addFlashAttribute("num" , num);
		return "redirect:/service/scoreList";
	}
}
