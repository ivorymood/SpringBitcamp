package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;

@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired ShiftFactory shift;
	@Autowired Command cmd;
	@Autowired TxService txService;
	@Autowired TxDTO tx;
	
	@RequestMapping(value="/mobile/openphone", method=RequestMethod.POST)
	public String openphone(Model model, @RequestParam("seq") String seq, 
			@RequestParam("telecom") String telecom, @ModelAttribute("user") MemberDTO member) {
		logger.info("PhoneController phoneSeq() phoneSeq is {} ", seq);
		logger.info("PhoneController telecom() telecom is {} ", telecom);
		tx.setTxKey(member.getId()+seq);
		tx.setId(member.getId());
		tx.setTelecom(telecom);
		tx.setPhoneNum(txService.createPhoneNum());
		
		System.out.println("키 : "+tx.getTxKey());
		System.out.println("핸드폰 번호 : "+tx.getPhoneNum());
		System.out.println("통신사 : "+tx.getTelecom());
		System.out.println("멤버ID : "+tx.getId());
		
		cmd.setTx(tx);
		txService.openPhone(cmd);
		logger.info("TxController openphone() telecom is {} ", "cmd 전달");
		return shift.create("user", "mypage");
	}
}
