package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CibilScoreCheck {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilid;
	
	private int regcustomerid;
	
	private String firstname;
	private String lastName;
	private String email;
	private String panNo;
	private long phoneNo;
	private String gender;
	private int cibilscore;
	private String status;
	private String comment;
	
	
	
	

}
