package com.news.mapper;

import java.util.List;

import com.news.dto.UserDto;
import com.news.vo.UserVo;

public interface UserMapper {

	public int register(UserVo user);
	
	public UserDto selectByMobileAndPassword(UserVo userVo);
	
	public List<UserVo> validMobileUnique(String mobile);
	
	public int checkUsername(UserVo userVo);
}
