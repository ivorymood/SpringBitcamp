package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String randomNumber, lottoNumber, money, count; 
	//3	
	//3, 6, 13, 23, 22, 59
	//5000원
	//횟수

}
