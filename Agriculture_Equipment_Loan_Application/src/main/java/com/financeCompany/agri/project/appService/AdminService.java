package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appModel.SubsidyOffer;

public interface AdminService {

	String addSubsidyOffer(SubsidyOffer subsidydetails);

	List<SubsidyOffer> getAllOffer();

	Object getSingleSubsidy(String productName);

}
