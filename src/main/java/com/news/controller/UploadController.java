package com.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.news.service.UploadService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UploadController {

	@Autowired
	private UploadService uploadService;
	
	@PostMapping("/upload")
	@ApiOperation(value = "上传文件", notes = "支持多个")
	public void upload(MultipartFile[] file){
		if(file==null || file.length==0){
			throw new  RuntimeException("上传文件个数少于1个");
		}
		
		uploadService.upload(file);
		
	}
}
