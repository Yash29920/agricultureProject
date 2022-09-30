package com.financeCompany.agri.project.appService;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.SubsidyOffer;

public interface AppService {

	ResponseEntity<String> addsubsidyoffer(SubsidyOffer subsidydetails );

	ResponseEntity<String> addEnquiry(EnquiryDetails enquiryDetails);

	ResponseEntity<Object> getAllEnquiry();

	ResponseEntity<Object> getAllOffer();

	ResponseEntity<Object> singleOffer(String productName);


}
