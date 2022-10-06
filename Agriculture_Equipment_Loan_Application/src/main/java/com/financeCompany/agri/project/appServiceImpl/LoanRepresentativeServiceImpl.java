package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appService.LoanRepresentativeService;

@Service
public class LoanRepresentativeServiceImpl implements LoanRepresentativeService{

	
	@Autowired
	private AppRepository repository;
	
	@Override
	public void emiUpdate(Integer enquiryid, List<EmiCalculation> emiCalculation) {
		
		EnquiryDetails enqForm = repository.findById(enquiryid).get();
		
		if(enqForm!=null) 
		{  
		  if(enqForm.getEmiCalculation().isEmpty()) { 
			  enqForm.setEmiCalculation(emiCalculation);} 
		  
		  else { 
			 List<EmiCalculation> list = enqForm.getEmiCalculation();
			 list.addAll(emiCalculation); 
			 enqForm.setEmiCalculation(list); 
			 	}
		  
		  repository.save(enqForm);
		}
		
		else
			throw new NoSuchElementException();
		
		
	}

	
}
