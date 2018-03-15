package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.LottoService;
import com.bitcamp.web.service.MemberService;
import com.bitcamp.web.service.MobileService;
import com.bitcamp.web.service.TxService;
@SessionAttributes("user")
@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired LottoService lottoService;
	@Autowired MemberService mService;
	@Autowired MobileService mobileService;
	@Autowired TxService txService;
	@Autowired LottoDTO lotto;
	@Autowired Command cmd;
	@Autowired MemberDTO member;
	@Autowired ShiftFactory shift;
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model, @PathVariable("userid")String userid,
			@PathVariable("password")String password) {
		logger.info("UserController login() ID is - {}", userid);
		logger.info("UserController login() PW is - {}", password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
		String path = "public:user/login.tiles";
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findMemberById(cmd));
			path = "public:user/mypage.tiles";
			model.addAttribute("tx", txService.selectById(cmd));
		}
		return path;
	}
	@RequestMapping("/check")
	public String check(Model model) {
		logger.info("UserController check() {}", "ENTERED");
		
		//mService.findMemberById(cmd).getId();
		return shift.create("user", "mypage");
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete(); //세션을 비우고 로그아웃 처리
		logger.info("[컨트롤러 : 로그아웃]");
		return "redirect:/login";
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
	@RequestMapping("/join")
	public String join() {
		logger.info("UserController join() - {}", "ENTERED");
		
		return "public:user/join.tiles";
	}
	@RequestMapping("/join/{userid}/{password}/{name}")
	public String join(@PathVariable("userid") String id, 
			@PathVariable("password") String pass, @PathVariable("name") String name) {
		logger.info("UserController join() ID is - {}", id);
		logger.info("UserController join() PW is - {}", pass);
		logger.info("UserController join() NAME is - {}", name);
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		cmd.setMember(member);
		mService.addMember(cmd);
		
		return "redirect:/login";
	}
	
}
