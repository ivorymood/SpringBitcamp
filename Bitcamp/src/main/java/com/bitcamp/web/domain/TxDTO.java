package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TxDTO {
private String txKey, id, count, total, regdate, telecom, phoneNum;
			//복합키, 폰시퀀스, 사용자 ID, 핸펀번호, 통신사
private FoodDTO food;
private MobileDTO mobile;
}
