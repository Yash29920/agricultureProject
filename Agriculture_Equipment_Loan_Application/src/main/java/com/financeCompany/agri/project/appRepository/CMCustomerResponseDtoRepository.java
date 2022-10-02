package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;

public interface CMCustomerResponseDtoRepository extends JpaRepository<CMCustomerResponseDto, Integer>{

	
	public CMCustomerResponseDto findByRegcustomerid(int regcustomerid);
}
