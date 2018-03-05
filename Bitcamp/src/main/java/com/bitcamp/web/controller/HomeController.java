package com.bitcamp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.domain.PathDTO;
import com.bitcamp.web.factory.ContextFactory;



/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("path")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory factory;	//이렇게 하면 싱글톤 개념. static이 됨.
	@Autowired PathDTO path;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
				
		model.addAttribute("serverTime", new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()) );
		model.addAttribute("path", factory.path());
		return "index";
	}
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info(" Move to {} ", "main/home");		// sysout.print 대체한것. 중괄호 속에 ,뒤에 있는 것이 들어가는 구조.
		return "public:main/home.tiles";
	}
	
	
	
}
