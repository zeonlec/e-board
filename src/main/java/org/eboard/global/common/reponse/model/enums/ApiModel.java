package org.eboard.global.common.reponse.model.enums;

import lombok.Getter;

/**
 * @author parksoobin
 * 
 * API 요청 결과에 대한 코드와 메시지를 정의
 */
@Getter
public enum ApiModel {
	
	SUCCESS(1,"성공"),
	FAIL(0,"실패");
	
	int code;
	String message;
	
	ApiModel(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
