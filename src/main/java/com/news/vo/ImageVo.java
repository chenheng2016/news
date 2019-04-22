package com.news.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ImageVo {

	private Integer id;
	
	private String imageUrl;
	
	@JsonIgnore
	private Integer goodPublishId;
	
	public Integer getGoodPublishId() {
		return goodPublishId;
	}

	public void setGoodPublishId(Integer goodPublishId) {
		this.goodPublishId = goodPublishId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
