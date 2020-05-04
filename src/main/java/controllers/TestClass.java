package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestClass {

	@RequestMapping("/test")
	public String getMsg() {
		return "hello-world";
	}
}
