package com.news.dto;

import com.news.bean.base.Dto;

public class SecondHandGoodDto extends Dto{

	private Integer id;//主键id
	
	private String name;//二手房品名字
	
	private String price;//二手商品价格
	
	private String publishTime;//发布时间
	
	private String description;//二手商品描述
	
	private String images;//图片列表
	
	private String address;//地址
	
	private String feature;//特征
	
	private String linkPerson;//联系人
	
	private String linkWay;//联系方式
	
	private Integer userId;//对应的哪个用户
	
	private Integer productId;//产品id  1 宠物 2 二手 
	
	private Integer subProductId;//子产品id  猫 1 狗 2 
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSubProductId() {
		return subProductId;
	}

	public void setSubProductId(Integer subProductId) {
		this.subProductId = subProductId;
	}

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getLinkPerson() {
		return linkPerson;
	}

	public void setLinkPerson(String linkPerson) {
		this.linkPerson = linkPerson;
	}

	public String getLinkWay() {
		return linkWay;
	}

	public void setLinkWay(String linkWay) {
		this.linkWay = linkWay;
	}

}
