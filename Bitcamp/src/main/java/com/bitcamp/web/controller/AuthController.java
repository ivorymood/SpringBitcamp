package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.domain.PathDTO;
import com.bitcamp.web.factory.ContextFactory;


@Controller
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired ContextFactory contextFactory;

	@RequestMapping("/login")	//디폴트가 get방식이므로 method 생략 가능, get방식일때는 value도 생략가능
	public String login(Model model) {
		logger.info("AuthController login() - {}", "ENTERED");
		return "public:user/login.tiles";
	}
	
}
