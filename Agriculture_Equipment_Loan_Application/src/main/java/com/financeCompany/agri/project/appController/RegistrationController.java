package com.financeCompany.agri.project.appController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.financeCompany.agri.project.appDto.DocumentsDto;
import com.financeCompany.agri.project.appModel.Documents;
import com.financeCompany.agri.project.appModel.RegistrationDetails;
import com.financeCompany.agri.project.appService.RegistrationService;

@RestController
@RequestMapping("/registrationDetails")
@CrossOrigin("*")
public class RegistrationController 
{
	@Autowired
	private RegistrationService service;
	
	
	@GetMapping("/check")
	public String checkApi()
	{
		return "RegistrationDetails Works..!";
		
	}
	
	// end points : http://localhost:9999/registrationDetails/addRegistrationDetails
	
	@PostMapping("/addRegistrationDetails")
	public ResponseEntity<String> addRegistrationDetails(@RequestBody RegistrationDetails registrationDetails)
	   {
		System.out.println(registrationDetails.getEmail());
	    String str = service.addRegistrationDetails(registrationDetails);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	   }
	
	
	@PutMapping(value="/saveDocuments", consumes =MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> saveDocuments
	
	(	@PathVariable String panNo,
		@RequestPart MultipartFile pancard ,
		@RequestPart MultipartFile incomeTaxReturn, 
		@RequestPart MultipartFile	aadharCard,
		@RequestPart MultipartFile	photo,
		@RequestPart MultipartFile	cancelCheque,
		@RequestPart MultipartFile	signature,
		@RequestPart MultipartFile	thumb,
		@RequestPart MultipartFile	landDocumentA,
		@RequestPart MultipartFile	landDocumentB,
		@RequestPart MultipartFile	addressProof,
		@RequestPart MultipartFile	equipmentQuotation,
		@RequestPart MultipartFile	gSignature,
		@RequestPart MultipartFile	gPhoto,			
		@RequestPart MultipartFile  gBankStatement ) throws IOException{
			
		
		DocumentsDto doc =new DocumentsDto();
		doc.setPanNo(panNo);
		System.out.println(panNo);
		doc.setPancard(pancard.getBytes());
		doc.setIncomeTaxReturn(incomeTaxReturn.getBytes());
		doc.setAadharCard(aadharCard.getBytes());
		doc.setPhoto(photo.getBytes());
		doc.setCancelCheque(cancelCheque.getBytes());
		doc.setSignature(signature.getBytes());
		doc.setThumb(thumb.getBytes());
		doc.setLandDocumentA(landDocumentA.getBytes());
		doc.setLandDocumentB(landDocumentB.getBytes());
		doc.setAddressProof(addressProof.getBytes());
		doc.setEquipmentQuotation(equipmentQuotation.getBytes());
		doc.setGBankStatement(gBankStatement.getBytes());
		doc.setGPhoto(gPhoto.getBytes());
		doc.setGSignature(gSignature.getBytes());
		
		
		service.saveDocuments(doc);
		return new ResponseEntity<String>("Data Inserted",HttpStatus.OK);	
	}

	// end points : http://localhost:9999/registrationDetails/getRegistrationDetails
	
	@GetMapping(value = "/getRegistrationDetails",produces ={"application/json"})
	
	public ResponseEntity<List<RegistrationDetails>> getRegistrationDetails()
	{
		 List<RegistrationDetails> registrationDetails = service.getRegistrationDetails();
		 return new ResponseEntity<List<RegistrationDetails>>(registrationDetails,HttpStatus.OK);
	}
	
	
	// end point : http://localhost:9999/registrationDetails/getSingleMapping/12345
	
	@GetMapping(value = "/getSingleMapping/{regcustomerid}",produces ={"application/json"} )
	public ResponseEntity<RegistrationDetails> getSingleRegistration(@PathVariable int regcustomerid)
	{
		RegistrationDetails obj = service.getSingleRegistration(regcustomerid);
		 return new ResponseEntity<RegistrationDetails>(obj,HttpStatus.OK);
	}
	
	

}
