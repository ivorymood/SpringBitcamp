package com.bitcamp.web.service;

import com.bitcamp.web.command.ResultMap;

public interface AccountService {

	public ResultMap openAccount();

	public ResultMap searchAccount();

	public ResultMap findAccountById();

}
