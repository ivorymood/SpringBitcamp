package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberMapper {
	
		public void insertMember(Command cmd);
		public void updateMember(Command cmd);
		public void deleteMember(Command cmd);
		
		public List<MemberDTO> selectAll();
		public List<MemberDTO> selectByName(Command cmd);    
		public MemberDTO selectById(Command cmd);
		public int count();

		public int exist(Command cmd);
	}
