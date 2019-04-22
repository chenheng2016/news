package com.news.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.news.dto.ImageDto;
import com.news.vo.ImageVo;

public interface ImageMapper {

	public int insert(ImageDto imageDto);
	
	public int update(@Param("list") List<ImageVo> list);
	
	public List<ImageDto> getList(Integer id);
}
