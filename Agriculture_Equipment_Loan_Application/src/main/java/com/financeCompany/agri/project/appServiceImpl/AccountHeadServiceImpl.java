package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appDto.SanctionLetterDto;
import com.financeCompany.agri.project.appRepository.SanctionLetterRepository;
import com.financeCompany.agri.project.appService.AccountHeadService;

@Service
public class AccountHeadServiceImpl implements AccountHeadService{

	@Autowired 
	private SanctionLetterRepository sanctionLetterRepository;
	
	@Override
	public List<SanctionLetterDto> getAllSanctionLetters() {
		
		List<SanctionLetterDto> list = sanctionLetterRepository.findAll();
		
		if(list==null)
			throw new NullPointerException();
		
		else 
			return list;
	}

	
	
	
	
}
