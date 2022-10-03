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

import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appService.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/adminApi")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	@PostMapping(value = "/addSubsidyOffer", produces = { "application/json" })
	public ResponseEntity<String> addSubsidyOffer(@RequestBody SubsidyOffer subsidydetails) 
	{
		  System.out.println(subsidydetails.getProductName());
          String str=adminService.addSubsidyOffer(subsidydetails);
          return new ResponseEntity<String>(str,HttpStatus.CREATED);
    }
	
	/////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/getAllSubsidyOffer", produces = { "application/json" })
	public ResponseEntity<List<SubsidyOffer>> getAllOffer() 
	{
	      List<SubsidyOffer> list = adminService.getAllOffer();
          return new ResponseEntity<List<SubsidyOffer>>(list,HttpStatus.OK);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/getSingleSubsidy/{productName}", produces = { "application/json" })
	public Object getSingleSubsidy(@PathVariable String productName) 
	{
		Object singleSubsidy = adminService.getSingleSubsidy(productName);
		 return new ResponseEntity<Object>(singleSubsidy,HttpStatus.FOUND);

	}	
	
	/////////////////////////////////////////////////////////////////////////////////

}
