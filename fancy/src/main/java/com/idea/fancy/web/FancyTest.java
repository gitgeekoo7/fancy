package com.idea.fancy.web;

import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class FancyTest {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello world!";
	}
	
	public static void main(String[] args) {
		System.out.println(DigestUtils.md5DigestAsHex("520".getBytes()));
	}

}
