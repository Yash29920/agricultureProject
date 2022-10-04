package com.financeCompany.agri.project.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appService.AccountHeadService;

@RestController
@CrossOrigin("*")
@RequestMapping("/accountHeadController")
public class AccountHeadController {
	
	@Autowired
	private AccountHeadService accountHeadService;
	
	@GetMapping("getAllSanctionLetters")
	public ResponseEntity<List<SanctionLetterDto>> getAllSanctionLetters(){
		
		List<SanctionLetterDto> list = accountHeadService.getAllSanctionLetters();
		
		return new ResponseEntity<List<SanctionLetterDto>>(list,HttpStatus.FOUND);
	}
	

	
	
}
