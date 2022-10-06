package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appDto.DocumentsDto;
import com.financeCompany.agri.project.appModel.Documents;
import com.financeCompany.agri.project.appModel.RegistrationDetails;

public interface RegistrationService 
{

 String addRegistrationDetails(RegistrationDetails registrationDetails);

 List<RegistrationDetails> getRegistrationDetails();

 RegistrationDetails getSingleRegistration(int regcustomerid);
	
	void saveDocuments(DocumentsDto doc);
	

}
