package com.news.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.news.bean.base.ResponseData;
import com.news.bean.base.ResponseSimpleData;
import com.news.dto.UserDto;
import com.news.service.UserService;
import com.news.vo.UserVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user/")
@Api(description = "用户相关的api")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "用户注册", notes = "用户注册功能")
	@PostMapping(value = "/register")
	public ResponseSimpleData register(@RequestBody UserVo userVo) {
		if (userVo.getMobile() == null || userVo.getMobile().trim().equals("") || userVo.getPassword() == null
				|| userVo.getPassword().trim().equals("")) {
			throw new RuntimeException("手机号和密码都不能为空");
		}
		ResponseSimpleData responseData = null;
		// 判断用户名是否重复
		List<UserVo> validMobileUnique = userService.validMobileUnique(userVo.getMobile());
		if (validMobileUnique != null && validMobileUnique.size() >= 1) {
			responseData = ResponseSimpleData.createByErrorMessage(Arrays.asList("用户名有重复"));
			return responseData;
		}

		int result = userService.register(userVo);
		if (result > 0) {
			responseData = ResponseSimpleData.createBySuccessMessage(Arrays.asList("添加成功"));
			return responseData;
		}
		responseData = ResponseSimpleData.createByErrorMessage(Arrays.asList("添加失败"));
		return responseData;
	}

	@ApiOperation(value = "用户登录", notes = "用户登录功能")
	@PostMapping(value = "/login")
	public ResponseData<UserDto> login(@RequestBody UserVo userVo) {
		if (userVo.getMobile() == null || userVo.getMobile().trim().equals("") || userVo.getPassword() == null
				|| userVo.getPassword().trim().equals("")) {
			throw new RuntimeException("手机号和密码都不能为空");
		}
		UserDto result = userService.selectByMobileAndPassword(userVo);
		ResponseData<UserDto> responseData = null;
		if (result != null) {
			responseData = ResponseData.createBySuccessMessageData(Arrays.asList("登录成功"), result);
			return responseData;
		}
		responseData = ResponseData.createByErrorMessage(Arrays.asList("登录失败"));
		return responseData;
	}

}
