package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Employeedetails {

	@Id
	int empid;
	String fullname;
	String designation;
	String email;
	String username;
	String password;
	long  mobile;
	
}
