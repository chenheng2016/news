package com.news.bean.base;

import java.util.List;

public class ResponseListData<T> {

	private List<T> data;

	private boolean isSuccess;

	private List<String> messages;

	public ResponseListData(boolean isSuccess) {
		this(isSuccess, null, null);
	}

	public ResponseListData(boolean isSuccess, List<String> msg, List<T> data) {
		this.isSuccess = isSuccess;
		this.messages = msg;
		this.data = data;
	}

	public ResponseListData(boolean isSuccess, List<String> msg) {
		this(isSuccess, msg, null);
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
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

	public static <T> ResponseListData<T> createBySuccess() {
		return new ResponseListData<T>(true);
	}

	public static <T> ResponseListData<T> createBySuccessMessageData(List<String> msg, List<T> data) {
		return new ResponseListData<T>(true, msg, data);
	}

	public static <T> ResponseListData<T> createByError() {
		return new ResponseListData<T>(false);
	}

	public static <T> ResponseListData<T> createByErrorMessage(List<String> errorMessage) {
		return new ResponseListData<T>(false, errorMessage);
	}

}
