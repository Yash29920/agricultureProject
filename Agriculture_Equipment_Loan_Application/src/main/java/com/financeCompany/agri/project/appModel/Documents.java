package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Documents 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentid;
	
	private byte[] pancard;
	
	private byte[] incomeTaxReturn;
	
	private byte[] aadharCard;
	
	private byte[] photo;

	private byte[] cancelCheque;
	
	private byte[] signature;
	
	private byte[] thumb;
	
	private byte[] landDocumentA;
	
	private byte[] landDocumentB;
	
	private byte[] addressProof;
	
	private byte[] equipmentQuotation;


}


