package com.idea.fancy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idea.fancy.common.Result;
import com.idea.fancy.service.IUserService;
import com.idea.fancy.vo.UserVo;

@RequestMapping("/user")
@Controller
public class UserLogin {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index1";
	}
	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Result doLogin(UserVo vo) {
		Result result = userService.getByName(vo);
		return result;
		
	}
	
	/**
	 * 页面跳转
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainPage() {
		return "love";
		
	}


}
