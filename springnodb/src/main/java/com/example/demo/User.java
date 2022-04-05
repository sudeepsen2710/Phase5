package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class User {
	@ResponseBody
	@RequestMapping("user")
	public String init() {
		return "hi simplilearn users welcome to docker";
	}

}
