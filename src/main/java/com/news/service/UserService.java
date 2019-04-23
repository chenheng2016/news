package com.news.service;

import java.util.List;

import com.news.dto.UserDto;
import com.news.vo.UserVo;

public interface UserService {

	public int register(UserVo user);
	
	public UserDto selectByMobileAndPassword(UserVo userVo);
	
	public List<UserVo> validMobileUnique(String mobile);
}
