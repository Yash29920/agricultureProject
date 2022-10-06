package com.financeCompany.agri.project.appService;

import java.util.Date;
import java.util.List;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.CustomerLedger;
import com.financeCompany.agri.project.appModel.DisbursementEntry;

public interface AccountHeadService {

	List<SanctionLetterDto> getAllSanctionLetters();

	String generateDisbursementLetter(DisbursementEntry disbursementEntry);
	
	//optional
	String generateDisbursementLetterByID(int regcustomerid);
	
	SanctionLetterDto getSanctioLetterBYId(int regcustomerid);

	CustomerLoanDisbursement getDisbursementLetterBYId(int regcustomerid);

	List<CustomerLoanDisbursement> getAllDisbursementLetters();
	
	CustomerLedger generateLedgerByID(int regcustomerid);

	

	

}
