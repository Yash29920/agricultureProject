package com.financeCompany.agri.project.appServiceImpl;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appService.AppService;

@Service
public class AppServiceImpl implements AppService
{

	@Autowired
	private AppRepository repository;
	
	@Override
	
	public String addEnquiry(EnquiryDetails enquiryDetails)
	{
		EnquiryDetails enquiryDetails1 = repository.save(enquiryDetails);
		if(enquiryDetails1.getUsername()!=null&&enquiryDetails1.getPassword()!=null)
		{
			return "Added into DB"; 
		} 
		 throw new NullPointerException();	 
	}
		
	@Override
	public List<EnquiryDetails> getAllEnquiry() 
	{
		List<EnquiryDetails> findAll = repository.findAll();
		
		if(findAll.isEmpty())
			throw new NullPointerException();
			
		else
			return findAll;
	}

	@Override
	public Object getSingleEnquiry(int enquiryid)
	{
		if(repository.existsById(enquiryid))
	{	 EnquiryDetails enquiryDetails = repository.findById(enquiryid).get();
			return enquiryDetails;
	}
		else 
			throw new NoSuchElementException();

}

	




	
}
