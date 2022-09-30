package com.financeCompany.agri.project.appController;

import org.springframework.beans.factory.annotation.Autowired;
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
	@CrossOrigin("*")
	public ResponseEntity<String> addRegistrationDetails(@RequestBody RegistrationDetails registrationDetails)
	{
		System.out.println(registrationDetails);
	   	return service.addRegistrationDetails(registrationDetails);
	
	}
	@GetMapping(value = "/getRegistrationDetails",produces ={"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<Object> getRegistrationDetails()
	{
		return service.getRegistrationDetails();
		
	}
	@GetMapping(value = "/getSingleMapping/{regcustomerid}",produces ={"application/json"} )
	@CrossOrigin("*")
	public ResponseEntity<Object> getSingleRegistration(@PathVariable int regcustomerid)
	{
		return service.getSingleRegistration(regcustomerid);
		
		
	}
	
	

}
