package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SubsidyOffer {
	@Id
	private int productId;
	private String productName;
	private String percentofSubsidy;
	private String maxsubsidyUpto;
	private String eligibilityCriteria;
	

}
