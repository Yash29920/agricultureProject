package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;

public interface AppService 
{

	public String addEnquiry(EnquiryDetails enquiryDetails);

	List<EnquiryDetails> getAllEnquiry();

	Object getSingleEnquiry(int enquiryid);
}
