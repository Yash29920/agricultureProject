package com.financeCompany.agri.project.appDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquirySubsidyOfferDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private int enquiryid;
	private String productName;
	private String percentageOfSubsidy;
	private String maxSubsidyUpto;
	private String eligibiltyCriteria;
	
	
	
	
}
