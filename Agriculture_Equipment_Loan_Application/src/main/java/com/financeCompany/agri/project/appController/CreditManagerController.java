package com.financeCompany.agri.project.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;
import com.financeCompany.agri.project.appDto.CreditManagerDto;
import com.financeCompany.agri.project.appDto.OperationHeadDto;
import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appService.CreditManagerService;


@RestController
@RequestMapping("/creditManager")
@CrossOrigin("*")
public class CreditManagerController {

	@Autowired
	private CreditManagerService cmservice;
	
	//end pt: http://localhost:9999/creditManager/cibilscore
	
	@PutMapping("/cibilscore")
	public ResponseEntity cibilscore(@RequestBody CibilScoreCheck cibilScoreCheck) 
	  { 
		  System.out.println(cibilScoreCheck.getCibilscore()); 
		  cmservice.cibilscore(cibilScoreCheck);
	   return new ResponseEntity(HttpStatus.OK);
	  }

	//end pt: http://localhost:9999/creditManager/emiUpdate
	
	@PutMapping("/emiUpdate")
	public ResponseEntity emiUpdate(@RequestBody List<EmiCalculation>emiCalculation) 
	  { 
		  System.out.println(emiCalculation.get(0).getRequiredLoanAmount()); 
		  cmservice.emiUpdate(emiCalculation);
	   return new ResponseEntity(HttpStatus.OK);
	  }
	
	/*
	 * @GetMapping(value = "/getSingleDtoEntry/{regcustomerid}",produces
	 * ={"application/json"} ) public ResponseEntity<CMCustomerResponseDto>
	 * getSingleDtoEntry(@PathVariable int regcustomerid) { CMCustomerResponseDto
	 * singleDtoEntry = cmservice.getSingleDtoEntry(regcustomerid); return new
	 * ResponseEntity<CMCustomerResponseDto>(singleDtoEntry,HttpStatus.OK);
	 * 
	 * }
	 */
	
	
}
