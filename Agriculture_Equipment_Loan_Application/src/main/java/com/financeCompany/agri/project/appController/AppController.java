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
	public ResponseEntity<String> addEnquiry(@RequestBody EnquiryDetails enquiryDetails)
	{
		System.out.println(enquiryDetails);
		String string = service.addEnquiry(enquiryDetails);
		return new ResponseEntity<String>(string,HttpStatus.CREATED);
		
	}
	@GetMapping(value = "/getAllEnquiry",produces = {"application/json"})
	
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiry()
	{
		 List<EnquiryDetails> list = service.getAllEnquiry();
		 return new ResponseEntity<List<EnquiryDetails>>(list,HttpStatus.OK);
	}
	
	@GetMapping( value = "/getSingleEnquiry",produces = {"application/json"})
	public Object getSingleEnquiry(@PathVariable int enquiryid)
	{
		Object enq= service.getSingleEnquiry(enquiryid);
		return new ResponseEntity<Object>(enq,HttpStatus.OK);
		
	}
}
	


