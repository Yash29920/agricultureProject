package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appDto.DocumentsDto;
import com.financeCompany.agri.project.appModel.Documents;
import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appRepository.DocumentRepository;
import com.financeCompany.agri.project.appRepository.RegistrationRepository;
import com.financeCompany.agri.project.appService.RegistrationService;

@Service
public class RegistrationServicceImpl implements RegistrationService
{
	
	@Autowired
	private RegistrationRepository regRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public String addRegistrationDetails(RegistrationDetails registrationDetails)
	{
		RegistrationDetails registrationDetails1 = regRepository.save(registrationDetails);
		
		if(registrationDetails1.getUsername()!=null)
		{
			 return "Added";
		} 
		 throw new NullPointerException();
		
	}
	
	@Override
	public void saveDocuments(DocumentsDto doc) {
	
		String panNo = doc.getPanNo();
		RegistrationDetails regDetails = regRepository.findByPanNoLike(panNo);
		System.out.println(regDetails.getMobile());
		System.out.println(regDetails.getEmail());
		
		
		Documents ddd=new Documents();
		
		ddd.setPanNo(panNo);
		ddd.setPancard(doc.getPancard());
		ddd.setIncomeTaxReturn(doc.getIncomeTaxReturn());
		ddd.setAadharCard(doc.getAadharCard());
		ddd.setPhoto(doc.getPhoto());
		ddd.setCancelCheque(doc.getCancelCheque());
		ddd.setSignature(doc.getSignature());
		ddd.setThumb(doc.getThumb());
		ddd.setLandDocumentA(doc.getLandDocumentA());
		ddd.setLandDocumentB(doc.getLandDocumentB());
		ddd.setAddressProof(doc.getAddressProof());
		ddd.setEquipmentQuotation(doc.getEquipmentQuotation());
		ddd.setGSignature(doc.getGSignature());
		ddd.setGPhoto(doc.getGPhoto());
		ddd.setGBankStatement(doc.getGBankStatement());
		
		
		regDetails.setDocuments(ddd);
		
		regRepository.save(regDetails);
	}

	@Override
	public List<RegistrationDetails> getRegistrationDetails()
	{
		List<RegistrationDetails> getAll = regRepository.findAll();

		if(getAll.isEmpty())
			throw new NullPointerException();
			
		else
			return getAll;
	}

	@Override
	public RegistrationDetails getSingleRegistration(int regcustomerid) {
		
		if(regRepository.existsById(regcustomerid))
		{	
			RegistrationDetails registrationDetails = regRepository.findById(regcustomerid).get();
			return registrationDetails;
		}
		else
			throw new NoSuchElementException();	
	}

	
}


