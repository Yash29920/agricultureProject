package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appDto.CMCusRespEMIDto;
import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;
import com.financeCompany.agri.project.appModel.CibilScoreCheck;
import com.financeCompany.agri.project.appModel.EmiCalculation;

public interface CreditManagerService {

	void cibilscore(CibilScoreCheck cibilScoreCheck);

	void emiUpdate(List<EmiCalculation> emiCalculation);

	CMCustomerResponseDto getSingleDtoEntry(int regcustomerid);

	String setCustomerPreference(CMCusRespEMIDto cMCusRespEMIDto);

}
