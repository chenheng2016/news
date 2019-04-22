package com.news.bean.base;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class ResponseData<T> implements Serializable {

	@ApiModelProperty
	private T data;

	private boolean isSuccess;

	private List<String> messages;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public ResponseData(boolean isSuccess) {
		this(isSuccess, null, null);
	}

	public ResponseData(boolean isSuccess, T data) {
		this(isSuccess, null, data);
	}

	public ResponseData(boolean isSuccess, List<String> msg) {
		this(isSuccess, msg, null);
	}

	public ResponseData(boolean isSuccess, List<String> msg, T data) {
		this.isSuccess = isSuccess;
		this.messages = msg;
		this.data = data;
	}

	public static <T> ResponseData<T> createBySuccess() {
		return new ResponseData<T>(true);
	}

	public static <T> ResponseData<T> createBySuccess(T data) {
		return new ResponseData<T>(true, data);
	}

	public static <T> ResponseData<T> createBySuccessMessage(List<String> msg) {
		return new ResponseData<T>(true, msg);
	}

	public static <T> ResponseData<T> createBySuccessMessageData(List<String> msg, T data) {
		return new ResponseData<T>(true, msg, data);
	}

	public static <T> ResponseData<T> createByError() {
		return new ResponseData<T>(false);
	}

	public static <T> ResponseData<T> createByErrorMessage(List<String> errorMessage) {
		return new ResponseData<T>(false, errorMessage);
	}

}
