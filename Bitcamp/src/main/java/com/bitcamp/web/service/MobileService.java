package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
@Component
public interface MobileService {

	public void openPhone(Command cmd);
	public List<MobileDTO> phones();
	
	public void addMobile(Command cmd);
	public void modifyMobile(Command cmd);
	public void removeMobile(Command cmd);

	public List<MobileDTO> selectByName(Command cmd);    
	public MobileDTO selectById(Command cmd);           
	public int count();

}
