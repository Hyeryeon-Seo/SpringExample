package com.seonuit.spring.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// 메소드 만들기
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World"; //response에 담고싶은 문자열 리턴
	}
	
}
