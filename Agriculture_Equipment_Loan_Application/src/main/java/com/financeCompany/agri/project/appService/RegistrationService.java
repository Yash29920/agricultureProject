package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.RegistrationDetails;

public interface RegistrationService 
{

 String addRegistrationDetails(RegistrationDetails registrationDetails);

 List<RegistrationDetails> getRegistrationDetails();

 Object getSingleRegistration(int regcustomerid);
	

}
