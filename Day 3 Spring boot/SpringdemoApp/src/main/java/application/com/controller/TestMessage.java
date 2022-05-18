package application.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessage {
	@GetMapping(value = "/message")
	String Message() {
		return "Hi This is String boot application";
	}

}
