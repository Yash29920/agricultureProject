package com.financeCompany.agri.project.appServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appService.CreditManagerService;


@Service
public class CreditManagerServiceIMPL implements CreditManagerService{

	@Autowired
	private RegistrationRepository regRepository;
	
	@Override
	public void cibilscore(Integer regcustomerid, CibilScoreCheck cibilScoreCheck) {
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		 registrationDetails.setCibilScoreCheck(cibilScoreCheck);
			
		 regRepository.save(registrationDetails);
		
	}

	
}
