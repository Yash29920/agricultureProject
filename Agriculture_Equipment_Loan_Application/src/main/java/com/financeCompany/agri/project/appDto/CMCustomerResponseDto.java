package com.financeCompany.agri.project.appDto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.financeCompany.agri.project.appModel.EmiCalculation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMCustomerResponseDto {

	
	private int regcustomerid;
	
	private String regFirstName;
	private String regMiddleName;
	private String regLastName;
	private String email;
	private String panNo;
	private long mobile;
	private String gender;
	private int cibilscore;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<CMCusRespEMIDto> cMCusRespEMIDto;
	
}
