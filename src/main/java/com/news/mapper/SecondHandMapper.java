package com.news.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.news.dto.CategoryDto;
import com.news.model.SecondHandGood;
import com.news.vo.MySecondHandVo;
import com.news.vo.SecondHandGoodVo;

public interface SecondHandMapper {

	public int insert(SecondHandGoodVo handerGoodVo);
	
	public List<SecondHandGood> selectList(MySecondHandVo secondHanderVo);

	public int getCount(MySecondHandVo mySecondHandVo);
	
	//TODO 带保留
	public SecondHandGood selectById(Integer id);

	public List<CategoryDto> getCategoryList(@Param("tableName") String tableName);

}
