package com.bitcamp.web.command;

import com.bitcamp.web.enums.Action;

import lombok.Data;

@Data
public class Command{
	protected String cmd, dir, page, view, column, data, sql;
	protected Action action;
	//상속잡을 생각이니까 protected ㅇㅇ
}
