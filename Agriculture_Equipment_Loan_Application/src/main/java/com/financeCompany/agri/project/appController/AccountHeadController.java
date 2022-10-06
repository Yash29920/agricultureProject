package com.financeCompany.agri.project.appController;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.CustomerLedger;
import com.financeCompany.agri.project.appModel.DisbursementEntry;
import com.financeCompany.agri.project.appRepository.LedgerRepository;
import com.financeCompany.agri.project.appService.AccountHeadService;

@RestController
@CrossOrigin("*")
@RequestMapping("/accountHeadController")
public class AccountHeadController {
	
	@Autowired
	private AccountHeadService accountHeadService;
	
	@Autowired
	private LedgerRepository lrepo;
	
	
	//end pt: http://localhost:9999/accountHeadController/getAllSanctionLetters
	
	@GetMapping("getAllSanctionLetters")
	public ResponseEntity<List<SanctionLetterDto>> getAllSanctionLetters(){
		
		List<SanctionLetterDto> list = accountHeadService.getAllSanctionLetters();
		
		return new ResponseEntity<List<SanctionLetterDto>>(list,HttpStatus.FOUND);
	}
	
	
	//end pt: http://localhost:9999/accountHeadController/generateDisbursementLetter
	
	  @PostMapping("/generateDisbursementLetter") 
	  public ResponseEntity<String> generateDisbursementLetter(DisbursementEntry disbursementEntry ){
	  
		  System.out.println(disbursementEntry.getRegcustomerid());
	  String msg = accountHeadService.generateDisbursementLetter(disbursementEntry);
	  
	  return new ResponseEntity<String>(msg,HttpStatus.OK); 
	  
	  }
	
	  
	  // Optional Method (if above don't workkk )
	//end pt: http://localhost:9999/accountHeadController/generateDisbursementLetter/1
		
	  @PostMapping("/generateDisbursementLetterByID/{regcustomerid}") 
	  public ResponseEntity<String> generateDisbursementLetterByID(@PathVariable int regcustomerid){
	  
		  System.out.println(regcustomerid);
		 // System.out.println(customerDisbursementDate);
	  String msg = accountHeadService.generateDisbursementLetterByID(regcustomerid);
	  
	  return new ResponseEntity<String>(msg,HttpStatus.OK); 
	  
	  }
	  
	  
	  
	  
	//end pt: http://localhost:9999/accountHeadController/getSanctioLetterBYId/1
		
	  @GetMapping("/getSanctioLetterBYId/{regcustomerid}")
	  public ResponseEntity<SanctionLetterDto> getSanctioLetterBYId(int regcustomerid)
	 {
		  System.out.println(regcustomerid);
		   SanctionLetterDto sanctioLetterBYId = accountHeadService.getSanctioLetterBYId(regcustomerid);  	
		  return new ResponseEntity<SanctionLetterDto>(sanctioLetterBYId,HttpStatus.OK);
	  }
	  
	  
	  
	//end pt: http://localhost:9999/accountHeadController/getDisbursementLetterBYId/1
		
	  @GetMapping("/getDisbursementLetterBYId/{regcustomerid}")
	  public ResponseEntity<CustomerLoanDisbursement> getDisbursementLetterBYId(int regcustomerid)
	 {
		  System.out.println(regcustomerid);
		  CustomerLoanDisbursement disbursementLetterBYId = accountHeadService.getDisbursementLetterBYId(regcustomerid);  	
		  return new ResponseEntity<CustomerLoanDisbursement>(disbursementLetterBYId,HttpStatus.OK);
	  }
	  
	//end pt: http://localhost:9999/accountHeadController/getAllDisbursementLetters
		  
	  @GetMapping("getAllDisbursementLetters")
		public ResponseEntity<List<CustomerLoanDisbursement>> getAllDisbursementLetters(){
			
			List<CustomerLoanDisbursement> list = accountHeadService.getAllDisbursementLetters();
			
			return new ResponseEntity<List<CustomerLoanDisbursement>>(list,HttpStatus.FOUND);
		}
		
	  
	//end pt: http://localhost:9999/accountHeadController/generateLedgerByID/1
		
	  @GetMapping("/generateLedgerByID/{regcustomerid}") 
	  public ResponseEntity<CustomerLedger> generateLedgerByID(int regcustomerid)
	  {
	  
		  CustomerLedger customerLedger = accountHeadService.generateLedgerByID(regcustomerid);
		  
		  lrepo.save(customerLedger);
		  
	      return new ResponseEntity<CustomerLedger>(customerLedger,HttpStatus.OK); 
	  }
	 
	

	  
	  
	
	
	
}
