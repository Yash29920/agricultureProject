package com.financeCompany.agri.project.appModel;

import java.time.LocalDate;


import lombok.Data;

@Data
public class DisbursementEntry {

	private int regcustomerid;
	
	private LocalDate customerDisbursementDate;
	
	
}
