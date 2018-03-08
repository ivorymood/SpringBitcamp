package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
@Repository
public class MemberMapperImpl implements MemberMapper {
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MemberMapperImpl.";
	@Override
	public void insertMember(Command cmd) {
		// TODO Auto-generated method stub
		logger.info("MemberMapperImpl insertMember() ID is - {}", cmd.getMember().getId());
		sqlSession.insert(ns+"insertMember", cmd);
	}

	@Override
	public int exist(Command cmd) {
		// TODO Auto-generated method stub
		logger.info("MemberMapperImpl exist() ID is - {}", cmd.getMember().getId());
		return sqlSession.selectOne(ns+"exist", cmd);
	}

	@Override
	public MemberDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		logger.info("MemberMapperImpl selectById() NAME is - {}", cmd.getMember().getId());
		return sqlSession.selectOne(ns+"selectById", cmd);
	}

	@Override
	public void deleteMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
