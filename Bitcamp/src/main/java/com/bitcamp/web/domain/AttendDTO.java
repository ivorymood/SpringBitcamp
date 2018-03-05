package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component
public class AttendDTO {
	String id, weak, status;

}