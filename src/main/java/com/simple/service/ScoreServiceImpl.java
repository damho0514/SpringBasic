package com.simple.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("scoreService")//컴포넌트 스캔이 읽어서 scoreService이름으로 빈으로 생성 ( 빈 = 스프링설정파일이름)
public class ScoreServiceImpl implements ScoreService{
	
//	@Autowired
//	public ScoreServiceImpl(ScoreDAOImpl dao) {
//		
//	}
	@Autowired
	private ScoreDAO scoreDao;
	
	@Override
	public void scoreRegist(ScoreVO vo) {
		
		scoreDao.scoreRegist(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> scoreList() {
//	ArrayList<ScoreVO> list	= scoreDao.scoreList();
		return scoreDao.scoreList();
	}
	
	@Override
	public void scoreDelete(int num) {
		
		scoreDao.scoreDelete(num);
	}

}
