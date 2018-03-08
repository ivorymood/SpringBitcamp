package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
@Component
public interface TxService {
	public void openPhone(Command cmd);
	public String createPhoneNum();
	
	public void addTx(Command cmd);
	public void modifyTx(Command cmd);
	public void removeTx(Command cmd);

	public List<TxDTO> list();
	public List<TxDTO> selectByName(Command cmd);    
	public TxDTO selectById(Command cmd);           
	public int count();

}
