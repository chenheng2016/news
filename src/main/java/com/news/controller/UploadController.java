package com.news.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.news.bean.base.ResponseListData;
import com.news.dto.ImageDto;
import com.news.service.UploadService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UploadController {

	@Autowired
	private UploadService uploadService;
	
	@PostMapping("/upload")
	@ApiOperation(value = "上传文件", notes = "支持多个")
	public ResponseListData<ImageDto> upload(MultipartFile[] file){
		if(file==null || file.length==0){
			throw new  RuntimeException("上传文件个数少于1个");
		}
		
		List<ImageDto> images=uploadService.upload(file);
		ResponseListData data=ResponseListData.createBySuccessMessageData(Arrays.asList("上传成功"), images);
		return data;
	}
}
