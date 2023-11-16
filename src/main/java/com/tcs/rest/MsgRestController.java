package com.tcs.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgRestController {
	
	@GetMapping
	@ResponseBody
	public String  getMsg() {
		return "Welcome to Docker  and Happy Learning...";
	}

}
