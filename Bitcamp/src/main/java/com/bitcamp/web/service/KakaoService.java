package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.KakaoDTO;
@Component
public interface KakaoService {

	public void addKakao(Command cmd);
	public void modifyKakao(Command cmd);
	public void removeKakao(Command cmd);

	public List<KakaoDTO> list();
	public List<KakaoDTO> findByName(Command cmd);    
	public KakaoDTO findById(Command cmd);           
	public int count();

}
