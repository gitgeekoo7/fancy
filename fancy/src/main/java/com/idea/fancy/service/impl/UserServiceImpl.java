package com.idea.fancy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.idea.fancy.common.Result;
import com.idea.fancy.dao.UserMapper;
import com.idea.fancy.pojo.User;
import com.idea.fancy.service.IUserService;
import com.idea.fancy.vo.UserVo;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public Result getByName(UserVo vo) {
		User user = userMapper.getByName(vo.getUsername());
		if(user != null) {
			if(user.getPassword().equals(DigestUtils.md5DigestAsHex(vo.getPassword().getBytes()))) {
				return Result.ok();
			}
		}
		return Result.build(400, "小主用户名密码输错啦~~~");
	}

}
