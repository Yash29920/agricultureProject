package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appService.RegistrationService;

@Service
public class RegistrationServicceImpl implements RegistrationService
{
	
	@Autowired
	private RegistrationRepository regRepository;
	
	@Override
	public String addRegistrationDetails(RegistrationDetails registrationDetails)
	{
		RegistrationDetails registrationDetails1 = regRepository.save(registrationDetails);
		
		if(registrationDetails1.getUsername()!=null)
		{
			 return "Added";
		} 
		 throw new NullPointerException();
		
		
	}

	@Override
	public List<RegistrationDetails> getRegistrationDetails()
	{
		List<RegistrationDetails> getAll = regRepository.findAll();

		if(getAll.isEmpty())
			throw new NullPointerException();
			
		else
			return getAll;
	}

	@Override
	public Object getSingleRegistration(int regcustomerid) {
		
		if(regRepository.existsById(regcustomerid))
		{	
			RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
			return registrationDetails;
		}
		else
			throw new NoSuchElementException();	
	}
}


