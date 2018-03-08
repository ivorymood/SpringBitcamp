package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.KakaoDTO;

@Component
public interface KakaoMapper {
	public void insertKakao(Command cmd);
	public void updateKakao(Command cmd);
	public void deleteKakao(Command cmd);

	public List<KakaoDTO> selectAll();
	public List<KakaoDTO> selectByName(Command cmd);    
	public KakaoDTO selectById(Command cmd);            
	public int count();

}
