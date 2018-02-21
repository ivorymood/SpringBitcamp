package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MemberService {
	public ResultMap joinMember();
	public ResultMap login();
	public ResultMap changePass(Command cmd);
	public ResultMap deleteMember();
	
}
