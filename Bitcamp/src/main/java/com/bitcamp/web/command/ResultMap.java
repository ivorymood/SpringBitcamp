package com.bitcamp.web.command;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.KakaoDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;

import lombok.Data;
@Component
@Data
public class ResultMap {
	protected AdminDTO admin;
	protected BoardDTO board;
	protected FoodDTO food;
	protected KakaoDTO kakao;
	protected LottoDTO lotto;
	protected MemberDTO member;
	protected MobileDTO mobile;
	protected TxDTO tx;
	
	protected List<AdminDTO> admins;
	protected List<BoardDTO> boards;
	protected List<FoodDTO> foods;
	protected List<KakaoDTO> kakaos;
	protected List<LottoDTO> lottos;
	protected List<MemberDTO> members;
	protected List<MobileDTO> mobiles;
	protected List<TxDTO> txs;
	
}
