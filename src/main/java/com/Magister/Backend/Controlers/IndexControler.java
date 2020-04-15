package com.Magister.Backend.Controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControler {
	
	@GetMapping("/")
	public String getIndex() {
		return "Teste!";
	}
	
}
