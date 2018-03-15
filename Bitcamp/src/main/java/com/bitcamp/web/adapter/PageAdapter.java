package com.bitcamp.web.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.service.BoardService;

@Component
public class PageAdapter {
	@Autowired Command cmd;
	@Autowired BoardService boardService;
	
	public Command attr(Page page) {
		page.setTotalCount(boardService.count());
		page.setTotalPage(0);
		page.setPageStart(0);
		page.setPageEnd(0);
		page.setPrevBlock(false);
		page.setNextBlock(false);
		page.setStartRow(0);
		page.setEndRow(0);
		cmd= new Command();	//cmd청소한 것
		cmd.setPaging(page);
		return cmd;
	}
}
