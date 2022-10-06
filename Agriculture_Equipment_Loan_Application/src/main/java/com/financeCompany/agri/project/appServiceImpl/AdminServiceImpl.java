package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.SubsidyOffer;
import com.financeCompany.agri.project.appRepository.SubsidyRepository;
import com.financeCompany.agri.project.appService.AdminService;

@Service
public class AdminServiceImpl implements AdminService{


	@Autowired
	private SubsidyRepository subsidyRepository;
	
	
	@Override
	public String addSubsidyOffer(SubsidyOffer subsidydetails) {
		SubsidyOffer subsidyoffer = subsidyRepository.save(subsidydetails);
		if(subsidyoffer==null)
			throw new NullPointerException();
			
		return "Added";	
	}

	@Override
	public List<SubsidyOffer> getAllOffer() {
		 List<SubsidyOffer> list = subsidyRepository.findAll();
		 
			if(list.isEmpty())
				throw new NullPointerException();
				
			else
				return list;
	}

	@Override
	public Object getSingleSubsidy(String productName) {
		
		Object findByProductNameLike = subsidyRepository.findByProductNameLike(productName);
		
		if(findByProductNameLike!=null)
			return findByProductNameLike;
		
		else
			throw new NoSuchElementException();
		
	}

	
	
}
