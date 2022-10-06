package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.financeCompany.agri.project.appDto.OperationHeadDto;
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
public class OperationHeadServiceImpl implements OperationHeadService {

	@Autowired
	private RegistrationRepository regRepository;

	@Override
	public void customerVerify(CustomerVerify customerVerify) {

		int regcustomerid = customerVerify.getRegcustomerid();
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();

		registrationDetails.setCustomerVerify(customerVerify);

		regRepository.save(registrationDetails);

	}

}
