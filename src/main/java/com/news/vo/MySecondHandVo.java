package com.news.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "我的发布")
public class MySecondHandVo extends SecondHandVo {

	@ApiModelProperty(value = "用户id", example = "10")
	private Integer userId;

	@JsonIgnore
	private Integer pageIndex;

	public Integer getPageIndex() {
		return (this.getPageNumber() - 1) * this.getPageSize();
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
