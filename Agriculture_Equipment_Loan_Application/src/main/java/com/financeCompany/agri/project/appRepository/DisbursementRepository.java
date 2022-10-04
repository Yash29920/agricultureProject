package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeCompany.agri.project.appDto.CustomerLoanDisbursement;

public interface DisbursementRepository extends JpaRepository<CustomerLoanDisbursement, Integer>{

}
