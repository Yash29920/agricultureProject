package com.financeCompany.agri.project.appController;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appService.LoanRepresentativeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/loanRepresentativeEmi")
public class LoanRepresentativeController {

	@Autowired
	private LoanRepresentativeService lrservice;
	
	@PutMapping("/emiUpdate/{enquiryid}")
	public ResponseEntity emiUpdate(@PathVariable Integer enquiryid, @RequestBody List<EmiCalculation>emiCalculation) 
	  { 
		  System.out.println(emiCalculation); 
		  lrservice.emiUpdate(enquiryid,emiCalculation);
	   return new ResponseEntity(HttpStatus.OK);
	  }
	
}
