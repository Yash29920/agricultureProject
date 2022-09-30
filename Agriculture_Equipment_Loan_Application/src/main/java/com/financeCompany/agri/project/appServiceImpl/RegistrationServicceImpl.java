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
	public ResponseEntity<String> addRegistrationDetails(RegistrationDetails registrationDetails)
	{
		regRepository.save(registrationDetails);
		
		if(registrationDetails.getRegcustomerid()!=0)
		{
			 return new ResponseEntity<String>("Added",HttpStatus.CREATED);
		} 
		 throw new NullPointerException();
		
		
	}

	@Override
	public ResponseEntity<Object> getRegistrationDetails()
	{
		List<RegistrationDetails> getAll = regRepository.findAll();

		if(getAll.isEmpty())
			throw new NullPointerException();
			
		else
			return new ResponseEntity<Object>(getAll,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getSingleRegistration(int regcustomerid) {
		
		if(regRepository.existsById(regcustomerid))
		{	
			RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
			return new ResponseEntity<Object>(registrationDetails,HttpStatus.OK);
		}
		else
		{
			throw new NoSuchElementException();
		}
		
		
	}
}


