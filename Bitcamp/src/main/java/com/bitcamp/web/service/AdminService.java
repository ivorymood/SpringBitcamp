package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.AdminDTO;
@Component
public interface AdminService {

	public ResultMap makeTable(Command cmd);
	public void addAdmin(Command cmd);
	public void modifyAdmin(Command cmd);
	public void removeAdmin(Command cmd);

	public List<AdminDTO> list();
	public List<AdminDTO> findBy(Command cmd);    
	public AdminDTO findById(Command cmd);           
	public int count();

}
