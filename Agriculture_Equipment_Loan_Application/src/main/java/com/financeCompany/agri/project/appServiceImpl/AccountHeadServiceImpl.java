package com.financeCompany.agri.project.appServiceImpl;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;
import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appModel.CustomerLedger;
import com.financeCompany.agri.project.appModel.DisbursementEntry;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.DisbursementRepository;
import com.financeCompany.agri.project.appRepository.LedgerRepository;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appRepository.SanctionLetterRepository;
import com.financeCompany.agri.project.appService.AccountHeadService;

@Service
public class AccountHeadServiceImpl implements AccountHeadService{

	@Autowired 
	private SanctionLetterRepository sanctionLetterRepository;
	
	@Autowired
	private  RegistrationRepository regRepository;
	
	@Autowired
	private DisbursementRepository disbursementRepository;
	
	@Autowired
	private LedgerRepository ledgerRepository;
	
	
	  @Override 
	  public List<SanctionLetterDto> getAllSanctionLetters() {
	  
	  List<SanctionLetterDto> list = sanctionLetterRepository.findAll();
	  
	  if(list==null) throw new NullPointerException();
	  
	  else return list; 
	  }


	@Override
	public String generateDisbursementLetter(DisbursementEntry disbursementEntry) {
		
		int regcustomerid = disbursementEntry.getRegcustomerid();
		Date customerDisbursementDate = disbursementEntry.getCustomerDisbursementDate();
		
		CustomerLoanDisbursement cld=new CustomerLoanDisbursement();
		
		cld.setRegcustomerid(regcustomerid);
		cld.setCustomerDisbursementDate(customerDisbursementDate);
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		cld.setRegFirstName(registrationDetails.getRegFirstName());
		cld.setRegMiddleName(registrationDetails.getRegMiddleName());
		cld.setRegLastName(registrationDetails.getRegLastName());
		
		cld.setEquipmentName(registrationDetails.getEquipmentName());
		cld.setEquipmentDetails(registrationDetails.getEquipmentDetails());
		
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findById(regcustomerid).get();
		
		cld.setRateOfInterest(sanctionLetterDto.getRateOfInterest());
		cld.setLoanTenure(sanctionLetterDto.getLoanTenure());
		cld.setMonthlyEmi(sanctionLetterDto.getMonthlyEmi());
		cld.setInterest(sanctionLetterDto.getInterest());
		cld.setTotalAmount(sanctionLetterDto.getTotalAmount());
		cld.setSanctionAmount(sanctionLetterDto.getSanctionAmount());
		
		cld.setProcessingFees(sanctionLetterDto.getProcessingFees());
		cld.setLoanDisbursedAmount(sanctionLetterDto.getSanctionAmount());
		
		//double loanTenure = sanctionLetterDto.getLoanTenure();
	//	Integer tenure=(int) loanTenure;
		
		//customerDisbursementDate
		
		//cld.setCustomerLoanCompletionDate();
		
		
		disbursementRepository.save(cld);
		
		//////////////////////////disbursement done ////////////////////////////////////////////////////////////////
		/////////////////////////auto Ledger set start///////////////////////////////////////////////////////////////////
		
		return "Added";
	}


	@Override
	public SanctionLetterDto getSanctioLetterBYId(int regcustomerid) {
		
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findById(regcustomerid).get();
		
		if(sanctionLetterDto == null)
			throw new NullPointerException();
		
		else 
			return sanctionLetterDto;
					
		
	}


	@Override
	public CustomerLoanDisbursement getDisbursementLetterBYId(int regcustomerid) {
		
		CustomerLoanDisbursement customerLoanDisbursement = disbursementRepository.findById(regcustomerid).get();
	
		if(customerLoanDisbursement == null)
			throw new NullPointerException();
		
		else 
			return customerLoanDisbursement;

	}


	@Override
	public CustomerLedger generateLedgerByID(int regcustomerid) {
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findById(regcustomerid).get();
		CustomerLedger cl =new CustomerLedger();
		cl.setRegcustomerid(regcustomerid);
		cl.setMonthlyEmi(sanctionLetterDto.getSanctionAmount());
		
		cl.setSanctionAmount(sanctionLetterDto.getSanctionAmount());
		CustomerLoanDisbursement customerLoanDisbursement = disbursementRepository.findById(regcustomerid).get();
		
		Date customerDisbursementDate = customerLoanDisbursement.getCustomerDisbursementDate();
		
		LocalDate paiddt= LocalDate.now();
		cl.setEmiPaidDate(paiddt);
		
		//LocalDate emiDuedt= emiDuedt.with()
		
		
		//cl.setEmiDueDate(emiDuedt);
		
		ledgerRepository.save(cl);
		
		return cl;
		
		
	}
	 

	  
	  
	
	
	
	
}
