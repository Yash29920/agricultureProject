package com.financeCompany.agri.project.appModel;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin
{
	  @Id
	  private int adminid;
	  private String adminname;
	  
	  @OneToMany(cascade=CascadeType.ALL)
	  private List<EnquiryDetails> enquirydetails;
	  
	  @OneToMany(cascade=CascadeType.ALL)
	  private List<RegistrationDetails> registrationdetails;
	  
	  @OneToMany(cascade=CascadeType.ALL)
	  private List<Employeedetails> employeedetails;


 
}
