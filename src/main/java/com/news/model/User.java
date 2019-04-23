package com.news.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.news.bean.base.Dto;

public class User extends Dto {
	
	@JsonIgnore
	private Integer id;

	private String username;//用户名 唯一
	
	private String password;//密码
	
	private Date createTime;//创建时间
	
	private Date updateTime;//更新时间
	
	private String isDel;//是否删除
	
	private String mobile;//手机号
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
