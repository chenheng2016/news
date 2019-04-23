package com.news.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.news.bean.base.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="用户vo")
public class UserVo extends Dto {
	
	
	@JsonIgnore
	private Integer id;
	
	@ApiModelProperty(value="用户名/昵称",example="cc")
	private String username;//用户名 唯一
	
	@ApiModelProperty(value="密码",example="123456")
	private String password;//密码
	
	@ApiModelProperty(value="手机号",example="13085123683")
	private String mobile;//手机号

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
