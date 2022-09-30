package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;

public interface AppService 
{

	ResponseEntity<String> addEnquiry(EnquiryDetails enquiryDetails);

	ResponseEntity<Object> getAllEnquiry();

	ResponseEntity<Object> getSingleEnquiry(int enquiryid);
}
