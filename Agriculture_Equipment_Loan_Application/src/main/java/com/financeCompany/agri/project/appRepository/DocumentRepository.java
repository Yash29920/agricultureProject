package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeCompany.agri.project.appModel.Documents;

public interface DocumentRepository extends JpaRepository<Documents, Integer>{

}
