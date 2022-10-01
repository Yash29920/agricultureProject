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
	@NotNull
	private byte[] pancard;
	
	private byte[] incomeTaxReturn;
	@NotNull
	private byte[] aadharCard;
	@NotNull
	private byte[] photo;
	@NotNull
	private byte[] cancelCheque;
	@NotNull
	private byte[] signature;
	@NotNull
	private byte[] thumb;
	@NotNull
	private byte[] landDocumentA;
	@NotNull
	private byte[] landDocumentB;
	@NotNull
	private byte[] addressProof;
	@NotNull
	private byte[] equipmentQuotation;


}


