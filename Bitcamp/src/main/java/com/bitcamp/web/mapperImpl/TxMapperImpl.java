package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;
@Repository
public class TxMapperImpl implements TxMapper{
@Autowired SqlSessionTemplate sqlSession;
String ns = "com.bitcamp.web.mapperImpl.TxMapperImpl.";
@Override
	public void insertPhone(Command cmd) {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"insertPhone", cmd);
	}
	@Override
	public void updateTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<TxDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<TxDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TxDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		System.out.println("TxMapperImpl의 selectById()"+cmd.getMember().getId());
		return sqlSession.selectOne(ns+"selectById", cmd);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
