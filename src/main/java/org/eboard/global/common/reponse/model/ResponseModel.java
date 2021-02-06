package org.eboard.global.common.reponse.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author parksoobin
 * 
 * API 실행 결과를 담는 공통 모델 
 */
@Getter
@Setter
public class ResponseModel {
	
	private boolean status; 
	private int code;
	private String message;
	
	/**
	 * @author parksoobin
	 * @param <T>
	 * 
	 * 실행 결과가 단일건인 경우 API를 담는 모델
	 */
	@Getter
	@Setter
	public static class SingleType<T> extends ResponseModel {
		private T data;
		private int returnKey;
	}
	
	/**
	 * @author parksoobin
	 * @param <T>
	 * 
	 * 실행 결과가 다중건인 경우 API를 담는 모델
	 */
	@Getter
	@Setter
	public static class MultipleType<T> extends ResponseModel {
		private List<T> datats;
	}
}
