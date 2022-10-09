package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appDto.EnquirySubsidyOfferDto;
import com.financeCompany.agri.project.appModel.CustomerMailSend;
import com.financeCompany.agri.project.appModel.EnquiryEmiCalculation;
import com.financeCompany.agri.project.appModel.SubsidyOffer;

public interface LoanRepresentativeService {

	
	String emiUpdate(List<EnquiryEmiCalculation> enquiryEmiCalculation);

	String provideOfferToEnquiry(List<EnquirySubsidyOfferDto> enquirySubsidyOfferDto);

	String sendMailToCustomer(CustomerMailSend mailInfo);

}
