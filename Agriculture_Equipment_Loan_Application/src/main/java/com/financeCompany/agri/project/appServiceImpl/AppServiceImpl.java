package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.EnquiryDetails;
import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appRepository.AppRepository;
import com.financeCompany.agri.project.appRepository.SubsidyRepository;
import com.financeCompany.agri.project.appService.AppService;

@Service
public class AppServiceImpl implements AppService
{

	@Autowired
	private AppRepository repository;
	
	@Autowired
	private SubsidyRepository subsidyrepository;
	
	@Override
	
	public ResponseEntity<String> addEnquiry(EnquiryDetails enquiryDetails)
	{
		repository.save(enquiryDetails);
		
	return new ResponseEntity<String>("Added",HttpStatus.CREATED);
	 
		  
	}
		
		
		
	

	@Override
	public ResponseEntity<Object> getAllEnquiry() 
	{
		List<EnquiryDetails> findAll = repository.findAll();
		
		if(findAll.isEmpty())
			throw new NullPointerException();
			
		else
			return new ResponseEntity<Object>(findAll,HttpStatus.OK);
	}





	@Override
	public ResponseEntity<String> addsubsidyoffer(SubsidyOffer subsidydetails) {
		SubsidyOffer subsidyoffer = subsidyrepository.save(subsidydetails);
		if(subsidyoffer==null)
			throw new NullPointerException();
		else
		return new ResponseEntity<String>("Added",HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Object> getAllOffer() {
		 List<SubsidyOffer> list = subsidyrepository.findAll();
		 
			if(list.isEmpty())
				throw new NullPointerException();
				
			else
				return new ResponseEntity<Object>(list,HttpStatus.OK);
		}

			
		



	@Override
	public ResponseEntity<Object> singleOffer(String productName) {
		Object object = subsidyrepository.findByProductNameLike(productName);
		return new ResponseEntity<Object>(object,HttpStatus.FOUND);
	}



	



	
}
