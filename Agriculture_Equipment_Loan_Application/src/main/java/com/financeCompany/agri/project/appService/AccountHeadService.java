package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.DisbursementEntry;

public interface AccountHeadService {

	List<SanctionLetterDto> getAllSanctionLetters();

	String generateDisbursementLetter(DisbursementEntry disbursementEntry);

	SanctionLetterDto getSanctioLetterBYId(int regcustomerid);

	CustomerLoanDisbursement getDisbursementLetterBYId(int regcustomerid);

}
