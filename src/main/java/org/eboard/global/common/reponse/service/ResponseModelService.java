package org.eboard.global.common.reponse.service;

import java.util.List;

import org.eboard.global.common.reponse.model.ResponseModel;
import org.eboard.global.common.reponse.model.ResponseModel.MultipleType;
import org.eboard.global.common.reponse.model.ResponseModel.SingleType;
import org.eboard.global.common.reponse.model.enums.ApiModel;
import org.springframework.stereotype.Service;

/**
 * API 응답결과(요청결과) 모델에 데이터를 넣어주는 역할을 할 Service 클래스
 * 
 * @author SUBINI
 *
 */

@Service
public class ResponseModelService {
	
	/**
	 * 응답 결과가 단일 건인 경우 처리
	 * 
	 * @param <T>
	 * @param data
	 * @return
	 */
	public <T> SingleType<T> getSingleResponse(T data) {
		SingleType<T> apiResult = new SingleType<>();
		apiResult.setData(data);
		setSuccessResult(apiResult);
		return apiResult;
	}
	
	/**
	 * 응답 결과가 다중 건인 경우 처리
	 * 
	 * @param <T>
	 * @param datas
	 * @return
	 */
	public <T> MultipleType<T> getMultipleResponse(List<T> datas) {
		MultipleType<T> apiResult = new MultipleType<>();
		apiResult.setDatats(datas);
		setSuccessResult(apiResult);
		return apiResult;
	}
	
	/**
	 * 성공 결과만을 처리
	 * 
	 * @return
	 */
	public ResponseModel getSuccessResult() {
		ResponseModel apiResult = new ResponseModel();
		setSuccessResult(apiResult);
		return apiResult;
	}
	
	/**
	 * 실패 결과만을 처리
	 * 
	 * @return
	 */
	public ResponseModel getFailResult() {
		ResponseModel apiResult = new ResponseModel();
		apiResult.setStatus(false);
		apiResult.setCode(ApiModel.FAIL.getCode());
		apiResult.setMessage(ApiModel.FAIL.getMessage());
		return apiResult;
	}
	
	/**
	 * 응답 결과 모델에 API 요청 성공 데이터를 세팅
	 * 
	 * @param apiModel
	 */
	public void setSuccessResult(ResponseModel apiModel) {
		apiModel.setStatus(true);
		apiModel.setCode(ApiModel.SUCCESS.getCode());
		apiModel.setMessage(ApiModel.SUCCESS.getMessage());
	}
}
