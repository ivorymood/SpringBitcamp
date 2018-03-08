package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class KakaoDTO {
	private String accSeq, accountNum, money, id;
	
	
}
