package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeCompany.agri.project.appModel.RegistrationDetails;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationDetails,Integer> 
{
	

}
