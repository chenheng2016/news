package com.news.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.news.bean.base.ResponseData;
import com.news.bean.base.ResponseListData;
import com.news.bean.base.ResponseSimpleData;
import com.news.dto.CategoryDto;
import com.news.model.SecondHandGoodStatis;
import com.news.service.ImageService;
import com.news.service.SecondHandService;
import com.news.vo.ImageVo;
import com.news.vo.MySecondHandVo;
import com.news.vo.SecondHandGoodVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/secondHand/")
@Api(description = "/宠物和二手相关的api")
public class SecondHandController {

	@Autowired
	private SecondHandService secondHandlerService;
	
	@Autowired
	private ImageService imageService;

	@PostMapping("/insert")
	@ApiOperation(value = "插入", notes = "发布信息")
	public ResponseSimpleData insert(@RequestBody SecondHandGoodVo secondHandGoodVo) {
		ResponseSimpleData responseSimpleData =null;
		//1.插入主表 返回主键id
		int count = secondHandlerService.insert(secondHandGoodVo);
		//2.更新图片表 
		List<ImageVo> images = secondHandGoodVo.getImages();
		if(images!=null && images.size()>0){
			//设置发布id
			for(ImageVo v:images){
				v.setGoodPublishId(secondHandGoodVo.getId());
			}
			//批量更新图片的发布id
			imageService.update(images);
		}
		// 插入图片之后
		if (count > 0) {
			responseSimpleData=ResponseSimpleData.createBySuccessMessage(Arrays.asList("添加成功"));
			return responseSimpleData;
		}

		responseSimpleData=ResponseSimpleData.createByErrorMessage(Arrays.asList("添加失败"));
		return responseSimpleData;
	}

	@PostMapping("/selectList")
	@ApiOperation(value = "分页查询发布信息", notes = "查询列表")
	public ResponseData<SecondHandGoodStatis> selectList(@RequestBody MySecondHandVo mySecondHandVo) {
		if (mySecondHandVo.getPageNumber() == null || mySecondHandVo.getPageSize() == null) {
			throw new RuntimeException("pageSize或pageNumber不能为空");
		}
		SecondHandGoodStatis goodStatis = secondHandlerService.selectList(mySecondHandVo);
		ResponseData<SecondHandGoodStatis> responseListData = ResponseData
				.createBySuccessMessageData(Arrays.asList("查询成功"), goodStatis);
		return responseListData;
	}

	@GetMapping("/getCategoryList")
	@ApiOperation(value = "分类查询列表", notes = "查询列表")
	public ResponseListData<CategoryDto> getCategoryList(
			@ApiParam(allowableValues = "1,2", example = "1", value = "1是宠物,2是二手信息") @RequestParam Integer type) {
		if (type == null) {
			throw new RuntimeException("type不能为空");
		}

		if (type != 1 && type != 2) {
			throw new RuntimeException("type不对，type只能是1或2");
		}

		List<CategoryDto> list = secondHandlerService.getCategoryList(type);
		ResponseListData<CategoryDto> data = ResponseListData.createBySuccessMessageData(Arrays.asList("查询成功"), list);
		return data;
	}

}
