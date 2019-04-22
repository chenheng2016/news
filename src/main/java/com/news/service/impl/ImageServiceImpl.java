package com.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.mapper.ImageMapper;
import com.news.service.ImageService;
import com.news.vo.ImageVo;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageMapper imageMapper;
	
	public int update(List<ImageVo> imageDtos){
		return imageMapper.update(imageDtos);
	}
}
