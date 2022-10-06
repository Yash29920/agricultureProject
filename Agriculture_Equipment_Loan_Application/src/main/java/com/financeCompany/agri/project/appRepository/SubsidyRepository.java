package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeCompany.agri.project.appModel.SubsidyOffer;

@Repository
public interface SubsidyRepository extends JpaRepository<SubsidyOffer, Integer>{

	public Object findByProductNameLike(String productName);
}
