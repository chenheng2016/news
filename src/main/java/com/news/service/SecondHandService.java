package com.news.service;

import java.util.List;

import com.news.dto.CategoryDto;
import com.news.model.SecondHandGoodStatis;
import com.news.vo.MySecondHandVo;
import com.news.vo.SecondHandGoodVo;

public interface SecondHandService {

	public int insert(SecondHandGoodVo handerGoodVo);

	public SecondHandGoodStatis selectList(MySecondHandVo mySecondHandVo);

	public List<CategoryDto> getCategoryList(Integer type);


}
