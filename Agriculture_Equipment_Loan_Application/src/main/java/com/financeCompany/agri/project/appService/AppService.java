package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.EnquiryDetails;

public interface AppService {

	ResponseEntity<String> addEnquiry(EnquiryDetails enquiryDetails);

	ResponseEntity<Object> getAllEnquiry();


}
