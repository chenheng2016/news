package com.news.model;

import java.util.List;

import com.news.bean.base.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="统计信息")
public class SecondHandGoodStatis extends Dto{

	@ApiModelProperty(value="返回总数",example="3")
	private int count;
	
	@ApiModelProperty(value="返回列表")
	private List<SecondHandGood> list;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<SecondHandGood> getList() {
		return list;
	}

	public void setList(List<SecondHandGood> list) {
		this.list = list;
	}
	
}
