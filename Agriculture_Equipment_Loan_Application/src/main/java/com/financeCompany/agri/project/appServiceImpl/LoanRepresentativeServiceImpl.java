package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appDto.EnquirySubsidyOfferDto;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.EnquiryEmiCalculation;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appRepository.SubsidyRepository;
import com.financeCompany.agri.project.appService.LoanRepresentativeService;

@Service
public class LoanRepresentativeServiceImpl implements LoanRepresentativeService{

	
	@Autowired
	private AppRepository repository;
	
	@Autowired
	private SubsidyRepository subsidyrepository;
	
	//////////////////////////////////////////////////////////////////////////////////
	@Override
	public String emiUpdate(List<EnquiryEmiCalculation>enquiryEmiCalculation) {
		
		EnquiryEmiCalculation enquiryEmiCalculation2 = enquiryEmiCalculation.get(0);
		int enquiryid = enquiryEmiCalculation2.getEnquiryid();
		
		EnquiryDetails enqForm = repository.findById(enquiryid).get();
		
		if(enqForm!=null) 
		{  
		  if(enqForm.getEnquiryEmiCalculation().isEmpty()) { 
			  enqForm.setEnquiryEmiCalculation(enquiryEmiCalculation);
			  } 
		  
		  else { 
			 List<EnquiryEmiCalculation> enquiryEmiCalculation3 = enqForm.getEnquiryEmiCalculation();
			 enquiryEmiCalculation3.addAll(enquiryEmiCalculation); 
			 enqForm.setEnquiryEmiCalculation(enquiryEmiCalculation3); 
			 	}
		  
		  repository.save(enqForm);
		  return "Data Added";
		}
		
		else
			throw new NoSuchElementException();
	}

	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	@Override
	public String provideOfferToEnquiry(List<EnquirySubsidyOfferDto> enquirySubsidyOfferDto) {
		
		int enquiryid = enquirySubsidyOfferDto.get(0).getEnquiryid();
		
		EnquiryDetails enquiryDetails = repository.findById(enquiryid).get();
		
		if(enquiryDetails!=null) 
		{  
		  if(enquiryDetails.getEnquirySubsidyOfferDto().isEmpty()) { 
			  enquiryDetails.setEnquirySubsidyOfferDto(enquirySubsidyOfferDto);
		} 
		  
		  else { 
			 List<EnquirySubsidyOfferDto> enquirySubsidyOfferDto2 = enquiryDetails.getEnquirySubsidyOfferDto();
			 enquirySubsidyOfferDto2.addAll(enquirySubsidyOfferDto); 
			 enquiryDetails.setEnquirySubsidyOfferDto(enquirySubsidyOfferDto2); 
			 	}
		  
		  repository.save(enquiryDetails);
		  
		  return "Added";
		}
		
		else
			throw new NoSuchElementException();
		
	}

	
}
