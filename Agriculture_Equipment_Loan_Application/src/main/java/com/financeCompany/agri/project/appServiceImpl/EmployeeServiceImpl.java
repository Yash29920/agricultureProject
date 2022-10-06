package com.financeCompany.agri.project.appServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeCompany.agri.project.appModel.Employeedetails;
import com.financeCompany.agri.project.appRepository.EmployeeRepository;
import com.financeCompany.agri.project.appService.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employeedetails emp) {
		
		if(emp.getUsername()==null)
			throw new NullPointerException();
		else
		employeeRepository.save(emp);
	
	}

	@Override
	public List<Employeedetails> getEmployee() {
		
		List<Employeedetails> list = employeeRepository.findAll();
		
		if(employeeRepository==null)
			throw new NullPointerException();
		
		else 
			return list;
					
	}

	@Override
	public void deleteEmployee(int empid) {
		
		boolean existsById = employeeRepository.existsById(empid);
		
		if(existsById==true)
			employeeRepository.deleteById(empid);
		else
			throw new NoSuchElementException();
		
	}

	@Override
	public void updateEmployee(Employeedetails emp) {
		
		if(emp==null)
			throw new NullPointerException();
		else
			employeeRepository.save(emp);
	}

	
	
	
	
	
	
	
	
}
