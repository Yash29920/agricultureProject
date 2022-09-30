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

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appService.AppService;

@RestController
@RequestMapping("/agriFinanceProject")
public class AppController 
{
	@Autowired
	private AppService service;
	
	@GetMapping("/check")
	public String checkApi()
	{
		return "EnquiryDetails Works..!";
		
	}
	@PostMapping("/addEnquiry")
	public ResponseEntity<String> addEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{
		System.out.println(enquiryDetails);
		return service.addEnquiry(enquiryDetails);
		
		
	}
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<Object> getAllEnquiry()
	{
		return service.getAllEnquiry();
		
	}
	
	@PostMapping(value="/addsubsidyoffer",produces= {"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<String>addsubsidyoffer(@RequestBody SubsidyOffer subsidydetails)
	{
		System.out.println(subsidydetails);
		
		return service.addsubsidyoffer(subsidydetails);
		
	}
	
	@PostMapping(value="/getAllOffer",produces= {"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<Object> getAllOffer()
	{
		return service.getAllOffer();
		
	}
	
	@PostMapping(value="/getsingle",produces= {"application/json"})
	@CrossOrigin("*")
	public ResponseEntity<Object> getsingle(@PathVariable String productName)
	{
		return service.singleOffer(productName);
		
	}
	
	
	
}




