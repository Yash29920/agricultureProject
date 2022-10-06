package com.financeCompany.agri.project.appModel;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class DisbursementEntry {

	private int regcustomerid;
	
	private LocalDate customerDisbursementDate;
	
	
}
