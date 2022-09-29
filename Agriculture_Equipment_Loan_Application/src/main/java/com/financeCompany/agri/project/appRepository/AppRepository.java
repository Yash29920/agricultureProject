package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeCompany.agri.project.appModel.EnquiryDetails;

@Repository
public interface AppRepository extends JpaRepository<EnquiryDetails,Integer>
{

}
