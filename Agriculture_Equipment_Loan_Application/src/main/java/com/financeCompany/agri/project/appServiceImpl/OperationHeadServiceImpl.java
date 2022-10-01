package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appRepository.SubsidyRepository;
import com.financeCompany.agri.project.appService.OperationHeadService;

@Service
public class OperationHeadServiceImpl implements OperationHeadService{

	@Autowired
	private AppRepository repository;
	
	@Autowired
	private RegistrationRepository regRepository;
	
	@Autowired
	private SubsidyRepository subsidyrepository;
	
	
	@Override
	public String addsubsidyoffer(SubsidyOffer subsidydetails)
	{
		SubsidyOffer subsidyoffer = subsidyrepository.save(subsidydetails);
		if(subsidyoffer==null)
			throw new NullPointerException();
			
		return "Added";	
	
	}
	
	@Override
	public List<SubsidyOffer> getAllOffer() {
		 List<SubsidyOffer> list = subsidyrepository.findAll();
		 
			if(list.isEmpty())
				throw new NullPointerException();
				
			else
				return list;
		}
	
	@Override
	public Object singleOffer(String productName)
	{
		Object object = subsidyrepository.findByProductNameLike(productName);
	
		if(object!=null)
			return object;
		else
			throw new NoSuchElementException();
	}

	@Override
	public void subsidyOffer(Integer enquiryid, List<SubsidyOffer> subsidyOffer) {
		
		EnquiryDetails enqForm = repository.findById(enquiryid).get();
		
		if(enqForm!=null) 
		{  
		  if(enqForm.getSubsidyOffer().isEmpty()) { 
			  enqForm.setSubsidyOffer(subsidyOffer);
		} 
		  
		  else { 
			 List<SubsidyOffer> list= enqForm.getSubsidyOffer();
			 list.addAll(subsidyOffer); 
			 enqForm.setSubsidyOffer(list); 
			 	}
		  
		  repository.save(enqForm);
		}
		
		else
			throw new NoSuchElementException();
		
	}


	@Override
	public void customerVerify(Integer regcustomerid, CustomerVerify customerVerify) {
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		 registrationDetails.setCustomerVerify(customerVerify);
			
		 regRepository.save(registrationDetails);
		
	}

	
}
