package com.financeCompany.agri.project.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appService.RegistrationService;

@RestController
@RequestMapping("/registrationDetails")
@CrossOrigin("*")
public class RegistrationController 
{
	@Autowired
	private RegistrationService service;
	
	
	@GetMapping("/check")
	public String checkApi()
	{
		return "RegistrationDetails Works..!";
		
	}
	
	@PostMapping(value = "/addRegistrationDetails",produces = {"application/json"})
	public ResponseEntity<String> addRegistrationDetails(@RequestBody RegistrationDetails registrationDetails)
	   {
		System.out.println(registrationDetails);
	    String str = service.addRegistrationDetails(registrationDetails);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	   }
	
	
	@GetMapping(value = "/getRegistrationDetails",produces ={"application/json"})
	
	public ResponseEntity<List<RegistrationDetails>> getRegistrationDetails()
	{
		 List<RegistrationDetails> registrationDetails = service.getRegistrationDetails();
		 return new ResponseEntity<List<RegistrationDetails>>(registrationDetails,HttpStatus.OK);
	}
	@GetMapping(value = "/getSingleMapping/{regcustomerid}",produces ={"application/json"} )
	
	public ResponseEntity<Object> getSingleRegistration(@PathVariable int regcustomerid)
	{
		 Object obj = service.getSingleRegistration(regcustomerid);
		 return new ResponseEntity<Object>(obj,HttpStatus.OK);
		
	}
	
	

}
