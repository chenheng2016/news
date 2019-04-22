package com.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dto.UserDto;
import com.news.mapper.UserMapper;
import com.news.service.UserService;
import com.news.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int register(UserVo user) {
		return userMapper.register(user);
	}

	@Override
	public UserDto selectByUserNameAndPassword(UserVo userVo) {
		return userMapper.selectByUserNameAndPassword(userVo);
	}

	@Override
	public List<UserVo> validUsernameUnique(String username) {
		return userMapper.validUsernameUnique(username);
	}

}
