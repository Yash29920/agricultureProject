package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeCompany.agri.project.appDto.CMCustomerResponseDto;

@Repository
public interface CMCustomerResponseRepository extends JpaRepository<CMCustomerResponseDto, Integer> {

}
