package dev.cifo.example.programming1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cifoweb")
@Controller
public class WebController {
	
	
	@RequestMapping("/javaspring")
	public String hellojava () {
		
		System.out.println("Hello world JAVA!!!!");
		
		
		return "programmingJava";
	}
	
	@RequestMapping("/jsReact")
	public String helloJS () {
		
		System.out.println("Hello world JS!!!!");
		
		return "programmingJS";
	}

}
