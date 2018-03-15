package com.bitcamp.web.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.web.adapter.Page;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.enums.ImageRepo;
import com.bitcamp.web.enums.Serv;
import com.bitcamp.web.enums.Table;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.proxy.FileProxy;
import com.bitcamp.web.proxy.PageProxy;
import com.bitcamp.web.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ShiftFactory shift;
	@Autowired BoardDTO board;
	@Autowired Command cmd;
	@Autowired BoardService boardService;
	@Autowired Page page;
	@Autowired PageProxy pxy;
	@Autowired FileProxy fileProxy;
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String boardList(Model model,
			@RequestParam(value="pageSize", defaultValue ="5") String pageSize,
			@RequestParam(value="blockSize", defaultValue="5") String blockSize,
			@RequestParam(value="pageNum", defaultValue="1") String pageNum) {
		
		logger.info("BoardController boardList {}", "ENTERED");
		page.setPageSize(Integer.parseInt(pageSize));
		page.setBlockSize(Integer.parseInt(blockSize));
		page.setPageNum(Integer.parseInt(pageNum));
		
		pxy.execute(model, page);
		return shift.create(Table.board.toString(), Serv.list.toString());
	}
	
	@RequestMapping(value="/detail/{bbsSeq}", method=RequestMethod.GET)
	public String detail(Model model,
			@PathVariable("bbsSeq") String bbsSeq
			) {
		logger.info("BoardController ReadList() - {}", "ENTERED");
		System.out.println("bbsSeq : " + bbsSeq);
		board.setBbsSeq(bbsSeq);
		cmd.setBoard(board);
		model.addAttribute("article", boardService.findBySeq(cmd));
		System.out.println("article내용은 : " + boardService.findBySeq(cmd));
		return shift.create("board", "read");
	}
	@RequestMapping(value="/fileupload", method=RequestMethod.POST)
	public String fileUpload(Model model, FileProxy pxy) throws IllegalStateException, IOException {
		logger.info("BoardController fileUpload() - {}", "ENTERED");
		//List<MultipartFile> files = pxy.getFiles();
		String fileName = pxy.getFile().getOriginalFilename();
		System.out.println("BoardController 업로드 된 파일 "+fileName);
		String path = ImageRepo.UPLOAD_PATH.toString() + fileName;
		File file = new File(path);
		pxy.getFile().transferTo(file);	
		//try catch 하지말고 throw. 스프링은 에러도 컨트롤러가 관리
		model.addAttribute("uploadImage", fileName);
		return shift.create(Table.board.toString(), "write");
	}
	
}
