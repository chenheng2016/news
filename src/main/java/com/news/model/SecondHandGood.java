package com.news.model;

import java.util.List;

import com.news.dto.ImageDto;

import io.swagger.annotations.ApiModelProperty;

public class SecondHandGood {

	@ApiModelProperty(value="主键id",example="2")
	private Integer id;//主键id
	
	@ApiModelProperty(value="名字",example="小黑")
	private String name;//二手房品名字
	
	@ApiModelProperty(value="价格",example="500")
	private String price;//二手商品价格
	
	@ApiModelProperty(value="发布时间",example="2019-04-21")
	private String publishTime;//发布时间
	
	@ApiModelProperty(value="描述",example="此猫小巧听话")
	private String desc;//二手商品描述
	
	@ApiModelProperty(value="图片",example="https://www.baidu.com/s?tn=50000022_hao_pg&wd=%E6%9D%8E%E5%BD%A6%E5%AE%8F+%E7%99%BE%E5%BA%A6%E7%BF%BB%E8%AF%91&usm=2&ie=utf-8&rsv_cq=%E7%99%BE%E5%BA%A6%E7%BF%BB%E8%AF%91&rsv_dl=0_right_recommends_merge_20826&euri=b1f02a70c8e5407bbee068f493457e51")
	private List<ImageDto> images;//图片列表
	
	@ApiModelProperty(value="地址",example="湖北省武汉市湖口社区")
	private String address;//地址
	
	@ApiModelProperty(value="特征",example="六个月 听话")
	private String feature;//特征
	
	@ApiModelProperty(value="联系人",example="cc")
	private String linkPerson;//联系人
	
	@ApiModelProperty(value="联系方式",example="13085123683")
	private String linkWay;//联系方式
	
	@ApiModelProperty(value="用户id",example="10")
	private Integer userId;//对应的哪个用户
	
	@ApiModelProperty(value="产品id",example="1",allowableValues="{1,2}")
	private Integer productId;//产品id  1 宠物 2 二手 
	
	@ApiModelProperty(value="子产品id",example="1")
	private Integer subProductId;//子产品id  猫 1 狗 2 
	
	@ApiModelProperty(value="标题",example="宠物猫")
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public List<ImageDto> getImages() {
		return images;
	}

	public void setImages(List<ImageDto> images) {
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
