package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class MemberDTO {
	private String id, pass, name, ssn, phone, email, profile, addr;
	private KakaoDTO kakao;
	private MobileDTO mobile;
	private FoodDTO food;
	private LottoDTO lotto;
	

	@Override
	public String toString() {
		return "회원정보 [ID: " + id + ", 비밀번호: " + pass + ", 이름: " + name + ", 주민번호(생년월일-첫번호): " + ssn + 
				", 전화번호: " + phone + ", 이메일: " + email + ", 프로필사진: " + profile + ", 주소: " + addr + "]";
	}
	
}
