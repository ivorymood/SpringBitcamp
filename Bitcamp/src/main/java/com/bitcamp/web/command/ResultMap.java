package com.bitcamp.web.command;

import java.util.List;

import com.bitcamp.web.domain.AttendDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.KakaoDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;

import lombok.Data;

@Data
public class ResultMap {
	protected MemberDTO member;
	protected KakaoDTO kakao;
	protected AttendDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected List<MemberDTO> members;
	protected List<KakaoDTO> kakaos;
	protected List<AttendDTO> attends;
	protected List<LottoDTO> lottos;
	protected List<FoodDTO> foods;
	protected List<MobileDTO> mobiles;
}
