package com.financeCompany.agri.project.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.DisbursementEntry;
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
	
	
	
	  @PostMapping("/generateDisbursementLetter") 
	  public ResponseEntity<String> generateDisbursementLetter(DisbursementEntry disbursementEntry ){
	  
	  String msg = accountHeadService.generateDisbursementLetter(disbursementEntry);
	  
	  return new ResponseEntity<String>(msg,HttpStatus.OK); 
	  
	  }
	  
	  @GetMapping("/getSanctioLetterBYId/{regcustomerid}")
	  public ResponseEntity<SanctionLetterDto> getSanctioLetterBYId(int regcustomerid)
	 {
		  
		  SanctionLetterDto sanctionLetterDto = accountHeadService.getSanctioLetterBYId(regcustomerid);  	
		  return new ResponseEntity<SanctionLetterDto>(sanctionLetterDto,HttpStatus.OK);
	  }
	  
	  
	  
	  
	  @GetMapping("/getDisbursementLetterBYId/{regcustomerid}")
	  public ResponseEntity<CustomerLoanDisbursement> getDisbursementLetterBYId(int regcustomerid)
	 {
		  
		  CustomerLoanDisbursement customerLoanDisbursement = accountHeadService.getDisbursementLetterBYId(regcustomerid);  	
		  return new ResponseEntity<CustomerLoanDisbursement>(customerLoanDisbursement,HttpStatus.OK);
	  }
	  
	  
	/*
	 * @PostMapping("/generateDisbursementLetter") public ResponseEntity<String>
	 * generateDisbursementLetter(){
	 * 
	 * return new ResponseEntity<String>(); }
	 */
	
	
	  
	  
	  
	
	
	
}
