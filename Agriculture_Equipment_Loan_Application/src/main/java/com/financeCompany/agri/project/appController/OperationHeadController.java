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

import com.financeCompany.agri.project.appDto.OperationHeadDto;
import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appService.OperationHeadService;

@RestController
@CrossOrigin("*")
@RequestMapping("/operationHead")
public class OperationHeadController {

	@Autowired
	private OperationHeadService ohservice;
	

	@PutMapping("/customerVerify")
	public ResponseEntity customerVerify(@RequestBody CustomerVerify customerVerify) 
	  { 
		  System.out.println(customerVerify); 
		  ohservice.customerVerify(customerVerify);
	   return new ResponseEntity(HttpStatus.OK);
	  }


	
	

}
