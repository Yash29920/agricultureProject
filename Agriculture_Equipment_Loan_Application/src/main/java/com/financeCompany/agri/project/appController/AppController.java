package com.financeCompany.agri.project.appController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apicontroller")
public class AppController {
	
	@PostMapping("/create")
	public String create() {
		return "api Created";
		
	}
	
	
	

}
