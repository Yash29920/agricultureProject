package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appModel.EmiCalculation;

public interface LoanRepresentativeService {

	void emiUpdate(Integer enquiryid, List<EmiCalculation> emiCalculation);

}
