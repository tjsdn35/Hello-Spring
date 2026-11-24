package com.example.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 이미 잘선언되어 있는 클래스를
// @annotation클래스명으로 선언
// 스프링에서 즉석요청을 처리하는 클래스
// @Controller로 선언
@Controller
public class HelloController {
	// 요청 웹브라우저로 결과 응답 메소드 정의
	// 인터넷에서 문서를 요청한다.
	// 서버에 있는 특정한 폴더의 문서 또는
	// 서버가 필용한 경우 동적으로 만드는 문서
	// 리소스(자원=데이터)의 위치를 넘겨주어야 함
	// 리소스의 위치를 URI Uniform Resource Identifier
	@GetMapping("/hello")		// 브라우저에서 접속할 경로 설정
	//@ResponseBody				// 반환하는 문자열을 웹 브라우저에 직접 출력
	public String hello() {
		
		return "hello";
		
	}
}
