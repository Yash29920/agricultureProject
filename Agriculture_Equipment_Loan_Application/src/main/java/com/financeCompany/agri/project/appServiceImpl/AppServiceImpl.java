package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appService.AppService;

@Service
public class AppServiceImpl implements AppService
{

	@Autowired
	private AppRepository repository;
	
	@Override
	
	public ResponseEntity<String> addEnquiry(EnquiryDetails enquiryDetails)
	{
		repository.save(enquiryDetails);
		if(enquiryDetails.getUsername()!=null&&enquiryDetails.getPassword()!=null)
		{
			 return new ResponseEntity<String>("Added",HttpStatus.CREATED);
		} 
		 throw new NullPointerException();	 
	}
		
		
		
	

	@Override
	public ResponseEntity<Object> getAllEnquiry() 
	{
		List<EnquiryDetails> findAll = repository.findAll();
		
		if(findAll.isEmpty())
			throw new NullPointerException();
			
		else
			return new ResponseEntity<Object>(findAll,HttpStatus.OK);
	}




	
}
