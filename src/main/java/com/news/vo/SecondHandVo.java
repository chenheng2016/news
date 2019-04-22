package com.news.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="查询产品信息")
public class SecondHandVo {

	@ApiModelProperty(value="分页大小",example="2")
	private Integer pageSize;
	
	@ApiModelProperty(value="第几页",example="1")
	private Integer pageNumber;
	
	@ApiModelProperty(value="子产品id",example="1")
	private Integer subProductId;//子产品id
	
	@ApiModelProperty(value="产品id",example="1")
	private Integer productId;//产品id
	
	public Integer getSubProductId() {
		return subProductId;
	}

	public void setSubProductId(Integer subProductId) {
		this.subProductId = subProductId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	

}
