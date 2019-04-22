package com.news.bean.base;

import java.util.List;

public class ResponseSimpleData {

	private boolean isSuccess;

	private List<String> messages;
	
	public ResponseSimpleData(boolean isSuccess) {
		this(isSuccess, null);
	}

	public ResponseSimpleData(boolean isSuccess, List<String> msg) {
		this.isSuccess = isSuccess;
		this.messages = msg;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public static ResponseSimpleData createBySuccess() {
		return new ResponseSimpleData(true);
	}

	public static ResponseSimpleData createBySuccessMessage(List<String> msg) {
		return new ResponseSimpleData(true, msg);
	}

	public static ResponseSimpleData createByError() {
		return new ResponseSimpleData(false);
	}

	public static ResponseSimpleData createByErrorMessage(List<String> errorMessage) {
		return new ResponseSimpleData(false, errorMessage);
	}

}
