package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.financeCompany.agri.project.appController.CreditManagerController;
import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;
import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.CMCustomerResponseDtoRepository;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appService.CreditManagerService;


@Service
public class CreditManagerServiceIMPL implements CreditManagerService{

	@Autowired
	private RegistrationRepository regRepository;
	
	@Autowired
	private CMCustomerResponseDtoRepository cmCMCustomerResponseDtoRepository;
	
	
	@Override
	public void cibilscore(CibilScoreCheck cibilScoreCheck) {
		
		int regcustomerid = cibilScoreCheck.getRegcustomerid();
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		 registrationDetails.setCibilScoreCheck(cibilScoreCheck);
			
		 regRepository.save(registrationDetails);
		
	}

	@Override
	public void emiUpdate(List<EmiCalculation> emiCalculation) {
		
		EmiCalculation emiCalculation2 = emiCalculation.get(0);
		int regcustomerid = emiCalculation2.getRegcustomerid();
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		if(registrationDetails!=null) 
		{  
		  if(registrationDetails.getEmiCalculation().isEmpty()) { 
			  registrationDetails.setEmiCalculation(emiCalculation);} 
		  
		  else { 
			 List<EmiCalculation> list = registrationDetails.getEmiCalculation();
			 list.addAll(emiCalculation); 
			 registrationDetails.setEmiCalculation(list); 
			 	}
		  
		  regRepository.save(registrationDetails);
		  
		  //complete save of object done
		  
		  //new Automatic Operation Starts
		  
		if(emiCalculation.size()==3) {
			int regcustomerid2 = registrationDetails.getRegcustomerid();
		CMCustomerResponseDto object = new RestTemplate().getForObject("/getSingleMapping/"+regcustomerid2,CMCustomerResponseDto.class);
		
		cmCMCustomerResponseDtoRepository.save(object);
		
		}
		  
		}
		
		else
			throw new NoSuchElementException();
	}

	@Override
	public CMCustomerResponseDto getSingleDtoEntry(int regcustomerid) {
		
		
		CMCustomerResponseDto obj = cmCMCustomerResponseDtoRepository.findByRegcustomerid(regcustomerid);
		
		if(obj ==null)
			throw new NullPointerException();
		else
			return obj;
		
		
	}

	
	
	
}
