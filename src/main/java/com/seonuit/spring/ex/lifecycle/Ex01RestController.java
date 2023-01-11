package com.seonuit.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seonuit.spring.ex.lifecycle.model.Person;

@RestController   // @ Controller + @ResponseBody  (그래서 ResponseBody 이제 따로 써줄 필요없다)
@RequestMapping("/lifecycle/ex01") // 밑에서 안쓰려고 , 그럼 공통요소 빼고 나머지만 매핑해주면 됨
public class Ex01RestController {
	
	//spring sts 웬만하면 서버 껐다 안켜도 알아서 ..
	@RequestMapping("/3") // 특정 url이 response 호출할 수 있도록 mapping
	public String stringResponse() { // return 타입 String 으로 맞춰서 알아서 <html>방식으로
		return "안녕하세요 <br> RestController 입니다.";
	}

	// 직접만든 클래스의 객체 리턴
	@RequestMapping("/4")
	public Person objectResponse() {  // json을 내부적으로 만들어냄 key,value형태로 알아서 만들어줌
		Person person = new Person();
		person.setName("서혜련"); // setName, setAge 메소드로 > return시 json형태로
		person.setAge(25);
		
		return person;
	
	}
	
	// status code를 포함한 response
	@RequestMapping("/5")
	public ResponseEntity<Person> entityResponse() {
		Person person = new Person();
		person.setName("서혜련");
		person.setAge(25);
		
		//http status code / response에 담겨서 전달 , 상태를 숫자 코드를 헤더에 담아,  / 아래 IMPORT도 
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR); // 따로 안넣어주면 200 (정상)
		//사용자는 못보는데 개발자는 볼 수 있음 '500' 이런식으로.. ('검사'눌러서)
		
		return entity;
		
	}
	
	
}
