// src/main/java/com.example/SpringDemo1Application.java
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
	}

	@GetMapping(value = "/test")
	public UserDto test() {
		UserDto userDto = new UserDto();
		userDto.setName("김자바");
		// lombok라이브러리를 통해 setName함수 실행됨
		userDto.setAge(20);
		System.out.println(userDto.toString());
		return userDto;
	}
}
// 마우스 우측 클릭 > run as > spring boot app 실행
