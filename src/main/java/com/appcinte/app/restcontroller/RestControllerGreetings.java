package com.appcinte.app.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class RestControllerGreetings {

	@PutMapping(value = "/hi")
	public @ResponseBody String Greeting(@RequestParam(value = "nombre") List<String> nombre) {
		return "Hola "+nombre+ " !";
	}
	
}
