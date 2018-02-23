package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextFactory;
	
	@RequestMapping("/lalala")
	public String mypage(Model model) {
		logger.info("UserController mypage() - {}", "ENTERED");
		model.addAttribute("context", (String) new ContextFactory().create());
		model.addAttribute("js", contextFactory.path("js"));
		return "user/mypage";
	}
	@RequestMapping("/nav")
	public String nav() {
		logger.info("UserController nav() - {}", "ENTERED");
		return "common/nav";
	}

}
