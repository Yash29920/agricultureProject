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

import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appService.OperationHeadService;

@RestController
@CrossOrigin("*")
@RequestMapping("/operationHead")
public class OperationHeadController {

	@Autowired
	private OperationHeadService ohservice;
	
	
	@PostMapping(value = "/addsubsidyoffer", produces = { "application/json" })
	public ResponseEntity<String> addsubsidyoffer(@RequestBody SubsidyOffer subsidydetails) 
	{
		  System.out.println(subsidydetails);
          String str=ohservice.addsubsidyoffer(subsidydetails);
          return new ResponseEntity<String>(str,HttpStatus.CREATED);
    }
	
	@GetMapping(value = "/getAllSubsidyOffer", produces = { "application/json" })
	public ResponseEntity<List<SubsidyOffer>> getAllOffer() 
	{
	      List<SubsidyOffer> list = ohservice.getAllOffer();
          return new ResponseEntity<List<SubsidyOffer>>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getSingleSubsidy/{productName}", produces = { "application/json" })
	public Object getsingle(@PathVariable String productName) 
	{
		 Object singleOffer = ohservice.singleOffer(productName);
		 return new ResponseEntity<Object>(singleOffer,HttpStatus.FOUND);

	}	
	
	@PutMapping("/subsidyOffer/{enquiryid}")
	public ResponseEntity subsidyOffer(@PathVariable Integer enquiryid, @RequestBody List<SubsidyOffer>subsidyOffer) 
	  { 
		  System.out.println(subsidyOffer); 
		  ohservice.subsidyOffer(enquiryid,subsidyOffer);
	   return new ResponseEntity(HttpStatus.OK);
	  }
	
	@PutMapping("/customerVerify/{regcustomerid}")
	public ResponseEntity customerVerify(@PathVariable Integer regcustomerid, @RequestBody CustomerVerify customerVerify) 
	  { 
		  System.out.println(customerVerify); 
		  ohservice.customerVerify(regcustomerid,customerVerify);
	   return new ResponseEntity(HttpStatus.OK);
	  }



}
