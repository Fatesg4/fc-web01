package com.francisco.edivan;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRest {
	@GetMapping
	public String get() {
		return "Ok bom dia" + new Date();
	}
}
