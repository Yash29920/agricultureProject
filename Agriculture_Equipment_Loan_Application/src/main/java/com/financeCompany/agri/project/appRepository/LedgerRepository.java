package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeCompany.agri.project.appModel.CustomerLedger;

public interface LedgerRepository extends JpaRepository<CustomerLedger, Integer> {

}
