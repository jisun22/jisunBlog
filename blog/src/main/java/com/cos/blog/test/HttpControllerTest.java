package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> (HTML파일) @Controller

// 사용자가 => 응답(Data)
@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTest : " ;
	
	//localhost:8000/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("root").password("lee8542").email("root@naver.com").build();
		System.out.println(TAG+"getter : "+m.getId());
		m.setId(5000);
		System.out.println(TAG+"setter : "+m.getId());
		return "lombok test 완료";
	}
	
	// 인터넷 브라우저 요청은 무저건 get 요청밖에 할 수 없다. 
	// http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest( Member m ) {
		return "get 요청: "+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	@GetMapping("/http/post")
	public String postTest(@RequestBody Member m) { // MessageConverter (스프링부트)
		return "post 요청: "+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	@GetMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	@GetMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
