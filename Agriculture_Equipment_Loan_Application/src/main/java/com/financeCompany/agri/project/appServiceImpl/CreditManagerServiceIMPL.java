package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.financeCompany.agri.project.appDto.CMCusRespEMIDto;
import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appModel.EmiCalculation;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appRepository.SanctionLetterRepository;
import com.financeCompany.agri.project.appService.CreditManagerService;

@Service
public class CreditManagerServiceIMPL implements CreditManagerService {

	@Autowired
	private RegistrationRepository regRepository;

	
	
	@Autowired
	private SanctionLetterRepository sanctionLetterRepository;

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

		if (registrationDetails != null) {
			if (registrationDetails.getEmiCalculation().isEmpty()) {
				registrationDetails.setEmiCalculation(emiCalculation);

			}

			else {

				List<EmiCalculation> list = registrationDetails.getEmiCalculation();
				list.addAll(emiCalculation);
				registrationDetails.setEmiCalculation(list);
			}

			regRepository.save(registrationDetails);
		}

		else
			throw new NoSuchElementException();
	}

	
	  @Override public CMCustomerResponseDto getSingleDtoEntry(int regcustomerid) {
	  
	  
	  RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
	  
	  if(registrationDetails ==null) 
		  throw new NullPointerException(); 
	  else {
	  
	  CMCustomerResponseDto cmcusdto =new CMCustomerResponseDto();
	  
	  cmcusdto.setRegcustomerid(registrationDetails.getRegcustomerid());
	  cmcusdto.setRegFirstName(registrationDetails.getRegFirstName());
	  cmcusdto.setRegMiddleName(registrationDetails.getRegMiddleName());
	  cmcusdto.setRegLastName(registrationDetails.getRegLastName());
	  cmcusdto.setEmail(registrationDetails.getEmail());
	  cmcusdto.setPanNo(registrationDetails.getEmail());
	  cmcusdto.setMobile(registrationDetails.getMobile());
	  cmcusdto.setGender(registrationDetails.getGender());
	  cmcusdto.setCibilscore(registrationDetails.getCibilScoreCheck().getCibilscore());
	  cmcusdto.setStatus(registrationDetails.getCibilScoreCheck().getStatus());
	  
	  
	  cmcusdto.setEmiid1(registrationDetails.getEmiCalculation().get(0).getEmiid());
	  cmcusdto.setMonthlyEmi1(registrationDetails.getEmiCalculation().get(0).getMonthlyEmi());
	  cmcusdto.setInterest1(registrationDetails.getEmiCalculation().get(0).getInterest());
	  cmcusdto.setTotalAmount1(registrationDetails.getEmiCalculation().get(0).getTotalAmount());
	  cmcusdto.setRateOfInterest1(registrationDetails.getEmiCalculation().get(0).getRateOfInterest());
	  cmcusdto.setLoanTenure1(registrationDetails.getEmiCalculation().get(0).getLoanTenure());
	  cmcusdto.setRequiredLoanAmount1(registrationDetails.getEmiCalculation().get(0).getRequiredLoanAmount());


	  cmcusdto.setEmiid2(registrationDetails.getEmiCalculation().get(1).getEmiid());
	  cmcusdto.setMonthlyEmi2(registrationDetails.getEmiCalculation().get(1).getMonthlyEmi());
	  cmcusdto.setInterest2(registrationDetails.getEmiCalculation().get(1).getInterest());
	  cmcusdto.setTotalAmount2(registrationDetails.getEmiCalculation().get(1).getTotalAmount());
	  cmcusdto.setRateOfInterest2(registrationDetails.getEmiCalculation().get(1).getRateOfInterest());
	  cmcusdto.setLoanTenure2(registrationDetails.getEmiCalculation().get(1).getLoanTenure());
	  cmcusdto.setRequiredLoanAmount2(registrationDetails.getEmiCalculation().get(1).getRequiredLoanAmount());

	  cmcusdto.setEmiid3(registrationDetails.getEmiCalculation().get(2).getEmiid());
	  cmcusdto.setMonthlyEmi3(registrationDetails.getEmiCalculation().get(2).getMonthlyEmi());
	  cmcusdto.setInterest3(registrationDetails.getEmiCalculation().get(2).getInterest());
	  cmcusdto.setTotalAmount3(registrationDetails.getEmiCalculation().get(2).getTotalAmount());
	  cmcusdto.setRateOfInterest3(registrationDetails.getEmiCalculation().get(2).getRateOfInterest());
	  cmcusdto.setLoanTenure3(registrationDetails.getEmiCalculation().get(2).getLoanTenure());
	  cmcusdto.setRequiredLoanAmount3(registrationDetails.getEmiCalculation().get(2).getRequiredLoanAmount());

	  	return cmcusdto;
	  }
	 
	  }

	@Override
	public String setCustomerPreference(CMCusRespEMIDto cMCusRespEMIDto) {
		
		  	//new Automatic Sanction letter Generation Operation Starts
		
		SanctionLetterDto sld =new SanctionLetterDto();
		sld.setMonthlyEmi(cMCusRespEMIDto.getMonthlyEmi());
		sld.setInterest(cMCusRespEMIDto.getInterest());
		sld.setTotalAmount(cMCusRespEMIDto.getTotalAmount());
		sld.setLoanTenure(cMCusRespEMIDto.getLoanTenure());
		sld.setRateOfInterest(cMCusRespEMIDto.getRateOfInterest());
		
		int regcustomerid = cMCusRespEMIDto.getRegcustomerid();
		sld.setRegcustomerid(regcustomerid);
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		sld.setRegFirstName(registrationDetails.getRegFirstName());
		sld.setRegMiddleName(registrationDetails.getRegMiddleName());
		sld.setRegLastName(registrationDetails.getRegLastName());
		sld.setEquipmentName(registrationDetails.getEquipmentName());
		sld.setEquipmentDetails(registrationDetails.getEquipmentDetails());
		sld.setRequiredLoanAmount(registrationDetails.getRequiredLoanAmount());
		
		sld.setCibilscore(registrationDetails.getCibilScoreCheck().getCibilscore());
		
		//
		double requiredLoanAmount = registrationDetails.getRequiredLoanAmount();
		double sanctionAmt = (requiredLoanAmount)*0.7;
		sld.setSanctionAmount(sanctionAmt);

		double processingFs=(requiredLoanAmount)*0.2;
		sld.setProcessingFees(processingFs);
			
		sld.setStatus(registrationDetails.getCibilScoreCheck().getStatus());
		sld.setComment(registrationDetails.getCibilScoreCheck().getComment());
		
		sanctionLetterRepository.save(sld);
		
		return "OK";
	}
}
