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

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appService.AppService;

import net.bytebuddy.asm.Advice.Origin;

@RestController
@RequestMapping("/agriFinanceProject")
@CrossOrigin("*")
public class AppController 
{
	@Autowired
	private AppService service;
	
	@GetMapping("/check")
	public String checkApi()
	{
		return "EnquiryDetails Works..!";
		
	}
	@PostMapping(value = "/addEnquiry",produces = {"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<String> addEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{
		System.out.println(enquiryDetails);
		return service.addEnquiry(enquiryDetails);
		
		
	}
	@GetMapping(value = "/getAllEnquiry",produces = {"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<Object> getAllEnquiry()
	{
		return service.getAllEnquiry();
		
	}
	@GetMapping( value = "/getSingleEnquiry",produces = {"application/json"})
	public ResponseEntity<Object> getSingleEnquiry(@PathVariable int enquiryid)
	{
		service.getSingleEnquiry(enquiryid);
		return null;
		
	}
}
	


