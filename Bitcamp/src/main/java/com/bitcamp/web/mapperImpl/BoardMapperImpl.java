package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;

@Repository
public class BoardMapperImpl implements BoardMapper{
@Autowired SqlSessionTemplate sqlSession;
private static final Logger logger = LoggerFactory.getLogger(BoardMapperImpl.class);	
String ns = "com.bitcamp.web.mapperImpl.BoardMapperImpl.";
	@Override
	public void insertBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> selectList(Command cmd) {
		// TODO Auto-generated method stub
		logger.info("BoardMapperImpl Test");
		System.out.println("BoardMapperImpl List: "+sqlSession.selectList(ns+"selectList", cmd));
		
		
		
		return sqlSession.selectList(ns+"selectList", cmd);
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"count");
	}

	@Override
	public BoardDTO selectBySeq(Command cmd) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"selectBySeq", cmd);
	}

}
