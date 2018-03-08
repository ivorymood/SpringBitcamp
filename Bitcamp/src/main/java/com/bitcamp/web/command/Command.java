package com.bitcamp.web.command;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.KakaoDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.enums.Action;

import lombok.Data;

@Component
@Data
public class Command{
	protected String cmd, dir, page, view, column, data, sql;
	protected Action action;
	//상속잡을 생각이니까 protected ㅇㅇ
	protected AdminDTO admin;
	protected BoardDTO board;
	protected FoodDTO food;
	protected KakaoDTO kakao;
	protected LottoDTO lotto;
	protected MemberDTO member;
	protected MobileDTO mobile;
	protected TxDTO tx;
}
