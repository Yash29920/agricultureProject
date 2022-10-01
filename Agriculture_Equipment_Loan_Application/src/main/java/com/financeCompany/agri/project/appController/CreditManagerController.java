package com.financeCompany.agri.project.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appService.CreditManagerService;


@RestController
@RequestMapping("/creditManager")
@CrossOrigin("*")
public class CreditManagerController {

	@Autowired
	private CreditManagerService cmservice;
	
	@PutMapping("/cibilscore/{regcustomerid}")
	public ResponseEntity cibilscore(@PathVariable Integer regcustomerid, @RequestBody CibilScoreCheck cibilScoreCheck) 
	  { 
		  System.out.println(cibilScoreCheck); 
		  cmservice.cibilscore(regcustomerid,cibilScoreCheck);
	   return new ResponseEntity(HttpStatus.OK);
	  }

}
