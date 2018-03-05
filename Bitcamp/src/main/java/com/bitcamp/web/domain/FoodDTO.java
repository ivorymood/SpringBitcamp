package com.bitcamp.web.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FoodDTO implements Serializable{
	private String menu, price, count, checkbox, id;

	@Override
	public String toString() {
		return "메뉴 [상품명: " + menu + ", 가격: " + price + " 원, 수량: " + count + "]";
	}
	
}
