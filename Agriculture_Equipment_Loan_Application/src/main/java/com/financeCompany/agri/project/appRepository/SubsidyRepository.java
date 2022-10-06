package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeCompany.agri.project.appModel.SubsidyOffer;

public interface SubsidyRepository extends JpaRepository<SubsidyOffer, Integer>{

	public Object findByProductNameLike(String productName);
}
