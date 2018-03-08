package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
import com.bitcamp.web.service.MobileService;
@Service
public class MobileServiceImpl implements MobileService{
@Autowired MobileMapper mobileMapper;
@Autowired MobileDTO mobile;
	@Override
	public void openPhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MobileDTO> phones() {
		// TODO Auto-generated method stub
		return mobileMapper.selectAll();
	}

	@Override
	public void addMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MobileDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
