package com.news.mapper;

import java.util.List;

import com.news.dto.UserDto;
import com.news.vo.UserVo;

public interface UserMapper {

	public int register(UserVo user);
	
	public UserDto selectByUserNameAndPassword(UserVo userVo);
	
	public List<UserVo> validUsernameUnique(String username);
	
	public int checkUsername(UserVo userVo);
}
