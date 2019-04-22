package com.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dto.CategoryDto;
import com.news.mapper.SecondHandMapper;
import com.news.model.SecondHandGood;
import com.news.model.SecondHandGoodStatis;
import com.news.service.SecondHandService;
import com.news.vo.MySecondHandVo;
import com.news.vo.SecondHandGoodVo;

@Service
public class SecondHandServiceImpl implements  SecondHandService{

	@Autowired
	private SecondHandMapper secondHandlerMapper;
	
	
	@Override
	public int insert(SecondHandGoodVo handerGoodVo) {
		return secondHandlerMapper.insert(handerGoodVo);
	}

	@Override
	public SecondHandGoodStatis selectList(MySecondHandVo mySecondHandVo) {
		SecondHandGoodStatis goodStatis=new SecondHandGoodStatis();
		//这里没有用分页插件 TODO 以后也许会用
		//先查询总数
		//再查询列表
		int count=secondHandlerMapper.getCount(mySecondHandVo);
		goodStatis.setCount(count);
		
		mySecondHandVo.setPageIndex(mySecondHandVo.getPageIndex());
		List<SecondHandGood> list=secondHandlerMapper.selectList(mySecondHandVo);
		goodStatis.setList(list);
		return goodStatis;
	}

	@Override
	public List<CategoryDto> getCategoryList(Integer type) {
		String tableName="";
		if(type==1){
			tableName="pet";
		}else if(type==2){
			tableName="second";
		}
		List<CategoryDto> list=secondHandlerMapper.getCategoryList(tableName);
		return list;
	}

}
