package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appModel.CustomerVerify;
import com.financeCompany.agri.project.appModel.SubsidyOffer;

public interface OperationHeadService {

	public String addsubsidyoffer(SubsidyOffer subsidydetails);

	public List<SubsidyOffer> getAllOffer();

	public Object singleOffer(String productName);
	
	void subsidyOffer(Integer enquiryid, List<SubsidyOffer> subsidyOffer);

	void customerVerify(CustomerVerify customerVerify);


}
