package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.service.LottoService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired LottoService lottoService;
	@Autowired LottoDTO lotto;
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		logger.info("UserController mypage() - {}", "ENTERED");
		return "public:user/mypage.tiles";
	}
	@RequestMapping("/burgerking")
	public String burgerking() {
		logger.info("UserController burgerking() - {}", "ENTERED");
		return "public:burgerking/main.tiles";
	}
	@RequestMapping("/lotto")
	public String lotto() {
		logger.info("UserController lotto() - {}", "ENTERED");
		return "public:lotto/main.tiles";
	}
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money, Model model) {
		logger.info("UserController lottoNum() - {}", "ENTERED");
		lotto.setMoney(money);
		logger.info("Money is $ {}", money);
		List<LottoDTO> lottos = lottoService.createLottos(lotto);
		logger.info("로또번호는 {}", lottos);
		model.addAttribute("lottos", lottos);
		model.addAttribute("money", money);
		
		return "public:lotto/result.tiles";
	}
	
}
