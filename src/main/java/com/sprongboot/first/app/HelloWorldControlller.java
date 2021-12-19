package com.sprongboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlller {

		@GetMapping("/Hello-world")
		public String HelloWorld() {
			return "Hello Worldd!!!";
		}
}
