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
		LocalDate customerDisbursementDate = disbursementEntry.getCustomerDisbursementDate();
		
		CustomerLoanDisbursement cld=new CustomerLoanDisbursement();
		
		cld.setRegcustomerid(regcustomerid);
		cld.setCustomerDisbursementDate(customerDisbursementDate);
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		cld.setRegFirstName(registrationDetails.getRegFirstName());
		cld.setRegMiddleName(registrationDetails.getRegMiddleName());
		cld.setRegLastName(registrationDetails.getRegLastName());
		
		cld.setEquipmentName(registrationDetails.getEquipmentName());
		cld.setEquipmentDetails(registrationDetails.getEquipmentDetails());
		
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findByRegcustomeridLike(regcustomerid);
		
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
		
		return "Added";
	}

	/////////////////////////Disbursement by ID///////////////////////////////////////////////////////////////////
	// Optional method
	@Override
	public String generateDisbursementLetterByID(int regcustomerid) {
		
		CustomerLoanDisbursement cld=new CustomerLoanDisbursement();
		
		System.out.println(regcustomerid);
		cld.setRegcustomerid(regcustomerid);
		
		//cld.setCustomerDisbursementDate(customerDisbursementDate);
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		
		
		System.out.println(registrationDetails.getEmail());
		System.out.println(registrationDetails.getMobile());
		
		cld.setRegFirstName(registrationDetails.getRegFirstName());
		cld.setRegMiddleName(registrationDetails.getRegMiddleName());
		cld.setRegLastName(registrationDetails.getRegLastName());
		
		cld.setEquipmentName(registrationDetails.getEquipmentName());
		cld.setEquipmentDetails(registrationDetails.getEquipmentDetails());
		
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findByRegcustomeridLike(regcustomerid);
		
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
		
		
		
		
		return "Added";
	}
	

	@Override
	public SanctionLetterDto getSanctioLetterBYId(int regcustomerid) {
		
		SanctionLetterDto  sanctionLetterDto= sanctionLetterRepository.findByRegcustomeridLike(regcustomerid);
		
		System.out.println(sanctionLetterDto.getCibilscore());
		
		if(sanctionLetterDto == null)
			throw new NullPointerException();
		
		else 
			return sanctionLetterDto;
						
	}


	@Override
	public CustomerLoanDisbursement getDisbursementLetterBYId(int regcustomerid) {
		
		CustomerLoanDisbursement customerLoanDisbursement = disbursementRepository.findByRegcustomeridLike(regcustomerid);
		
		if(customerLoanDisbursement == null)
			throw new NullPointerException();
		
		else 
			return customerLoanDisbursement;

	}

	@Override
	public List<CustomerLoanDisbursement> getAllDisbursementLetters() {
		
		List<CustomerLoanDisbursement> list = disbursementRepository.findAll();
		
		if(list==null)
			throw new NullPointerException();
		
		else 
			return list;
	
	}

	
	static int i=1;
	static LocalDate updateDate;
	static double monthlyEmi;
	
	
	@Override
	public CustomerLedger generateLedgerByID(int regcustomerid) {
		
		RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
		SanctionLetterDto sanctionLetterDto = sanctionLetterRepository.findById(regcustomerid).get();
		CustomerLedger cl =new CustomerLedger();
		
		cl.setRegcustomerid(regcustomerid);
		
		cl.setCustomerName(registrationDetails.getRegFirstName()+" "+registrationDetails.getRegMiddleName()+" "+registrationDetails.getRegLastName());
		
		cl.setMonthlyEmi(sanctionLetterDto.getSanctionAmount());
		
		cl.setMonthlyEmi(sanctionLetterDto.getMonthlyEmi());
		
		cl.setInterest(sanctionLetterDto.getInterest());
		
		cl.setRateOfInterest(sanctionLetterDto.getRateOfInterest());
		
		cl.setSanctionAmount(sanctionLetterDto.getSanctionAmount());
		
		cl.setLoanTenure(sanctionLetterDto.getLoanTenure());
		
		CustomerLoanDisbursement customerLoanDisbursement = disbursementRepository.findById(regcustomerid).get();
		
		LocalDate customerDisbursementDate = customerLoanDisbursement.getCustomerDisbursementDate();
		
		cl.setEmiPaidDate(customerDisbursementDate);
		
		cl.setEmiDueDate(customerDisbursementDate.plusDays(10));
		
		cl.setNextEmiDate(customerDisbursementDate.plusMonths(i));
		
		cl.setLoanCompletionDate(customerDisbursementDate.plusMonths(sanctionLetterDto.getLoanTenure()));
		
		cl.setCurrentMonthEmiStatus("unpaid");
		
		
		double remainingamt=sanctionLetterDto.getSanctionAmount()-sanctionLetterDto.getMonthlyEmi();
		
		cl.setRemainingAmount(remainingamt);
		
		cl.setPaidEmiAmount(sanctionLetterDto.getSanctionAmount()-remainingamt);
		
		ledgerRepository.save(cl);
		
	
		
		while(i<sanctionLetterDto.getLoanTenure())
		{
			updateDate=customerDisbursementDate.plusMonths(i);
			i++;
		}
		
///////////////////////////////////////////////////////////////////////
		
		CustomerLedger customerLedger = ledgerRepository.findByRegcustomerid(regcustomerid);
		while(i<sanctionLetterDto.getLoanTenure())
		{
			if(customerLedger.getEmiPaidDate().compareTo(customerLedger.getEmiDueDate())>10)
			{
				double monthlyEmi2 = customerLedger.getMonthlyEmi();
				monthlyEmi=monthlyEmi2+monthlyEmi2*0.02;
				cl.setMonthlyEmi(monthlyEmi);
			}
		}
		
		
		return cl;
	}


	
	
}
