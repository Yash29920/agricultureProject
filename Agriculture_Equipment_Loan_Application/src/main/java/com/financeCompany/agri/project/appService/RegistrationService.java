package com.financeCompany.agri.project.appService;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.RegistrationDetails;

public interface RegistrationService 
{

 ResponseEntity<String> addRegistrationDetails(RegistrationDetails registrationDetails);

 ResponseEntity<Object> getRegistrationDetails();

 ResponseEntity<Object> getSingleRegistration(int regcustomerid);
	

}
