package com.financeCompany.agri.project.appController;

import java.util.List;

import org.apache.coyote.Response;
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

import com.financeCompany.agri.project.appDto.EnquirySubsidyOfferDto;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.EnquiryEmiCalculation;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appService.LoanRepresentativeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/loanRepresentative")
public class LoanRepresentativeController {

	@Autowired
	private LoanRepresentativeService lrservice;
	
	/////////////////////////////////////////////////////////////////////////////////
	
	@PutMapping("/emiUpdate")
	public ResponseEntity<String> emiUpdate(@RequestBody List<EnquiryEmiCalculation>enquiryEmiCalculation) 
	  { 
		  System.out.println(enquiryEmiCalculation); 
		  String msg= lrservice.emiUpdate(enquiryEmiCalculation);
	   return new ResponseEntity<String>(msg,HttpStatus.OK);
	  }
	
	/////////////////////////////////////////////////////////////////////////////////
	
	
	@PutMapping("/provideOfferToEnquiry")
	public ResponseEntity <String >provideOfferToEnquiry(@RequestBody List<EnquirySubsidyOfferDto> enquirySubsidyOfferDto) 
	  { 
		  System.out.println(enquirySubsidyOfferDto); 
		 String msg = lrservice.provideOfferToEnquiry(enquirySubsidyOfferDto);
	   return new ResponseEntity<String>(msg,HttpStatus.OK);
	  }
	
	/////////////////////////////////////////////////////////////////////////////////
	
	
}
