package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardSeviceImpl implements BoardService{
@Autowired BoardMapper boardMapper;
private static final Logger logger = LoggerFactory.getLogger(BoardSeviceImpl.class);	
	@Override
	public void addBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> list(Command cmd) {
		logger.info("BoardServiceImpl TEST");
		// TODO Auto-generated method stub
		return boardMapper.selectList(cmd);
	}

	@Override
	public List<BoardDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return boardMapper.count();
	}

	@Override
	public BoardDTO findBySeq(Command cmd) {
		// TODO Auto-generated method stub
		return boardMapper.selectBySeq(cmd);
	}


}
