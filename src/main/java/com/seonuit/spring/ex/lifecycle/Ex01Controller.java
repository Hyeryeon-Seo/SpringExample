package com.seonuit.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {

	@ResponseBody //리턴되는 데이터를 response에 그대로 담아준다
	@RequestMapping("/lifecycle/ex01/1")   // annotation  (이 다 처리하도록 셋팅)
	public String stringResponse() {
		return "예제 1번 문자열을 담는 response";
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse() { //import도 꼭
		// 과일이름:가격   //메소드로 urlMapping가능 ? / map을 json형태로 전달 -..
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 3000);
		fruitMap.put("orange", 1000);
		
		return fruitMap;
		
	}
	
	
	
	
	
	
}
