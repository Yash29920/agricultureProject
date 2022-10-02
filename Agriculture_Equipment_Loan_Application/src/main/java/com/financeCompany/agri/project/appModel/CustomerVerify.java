package com.financeCompany.agri.project.appModel;

import java.sql.Date;

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
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVerify {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int verificationid;
	
	private int regcustomerid;
	
	private Date verificationDate;
	private String status;
	private String remarks;
	private String comment;
	

	
}
