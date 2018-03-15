package com.bitcamp.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bitcamp.web.adapter.Page;
import com.bitcamp.web.adapter.PageAdapter;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.service.BoardService;

@Component
public class PageProxy extends Proxy{
	@Autowired BoardService boardService;
	@Autowired Page page;
	@Autowired Command cmd;
	@Autowired PageAdapter adapter;
	@Override
	public void execute(Model model, Object o) {
		cmd=adapter.attr((Page) o);
		page=cmd.getPaging();
		model.addAttribute("page", page)
				.addAttribute("list", boardService.list(cmd));
	}


}
