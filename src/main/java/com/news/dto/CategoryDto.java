package com.news.dto;

import com.news.bean.base.Dto;

import io.swagger.annotations.ApiModelProperty;

public class CategoryDto extends Dto{

	@ApiModelProperty(value="分类id",example="1")
	private Integer id;
	
	@ApiModelProperty(value="分类名字",example="猫")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
