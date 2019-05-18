package com.idea.fancy.service;

import com.idea.fancy.common.Result;
import com.idea.fancy.pojo.User;
import com.idea.fancy.vo.UserVo;

public interface IUserService {
	
	Result getByName(UserVo vo);

}
