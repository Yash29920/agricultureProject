package com.financeCompany.agri.project.appService;

import java.util.List;

import com.financeCompany.agri.project.appModel.Employeedetails;

public interface EmployeeService {

	void saveEmployee(Employeedetails emp);

	List<Employeedetails> getEmployee();

	void deleteEmployee(int empid);

	void updateEmployee(Employeedetails emp);

}
