package com.financeCompany.agri.project.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeCompany.agri.project.appModel.Employeedetails;
import com.financeCompany.agri.project.appService.EmployeeService;

@RestController
@RequestMapping("/employeeapi")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employeedetails emp)
	{
		service.saveEmployee(emp);
		return new ResponseEntity<String>("Employee details saved",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employeedetails>> getEmployee()
	{
		List<Employeedetails> elist=service.getEmployee();
		return new ResponseEntity<List<Employeedetails>>(elist, HttpStatus.FOUND);
	}
	
	
	@DeleteMapping("/deleteEmployee/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int empid)
	{
		service.deleteEmployee(empid);
		return new ResponseEntity<String>("Employeee record deleted", HttpStatus.OK);
	}
	
	
	@PutMapping("updateEmployee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employeedetails emp)
	{
		service.updateEmployee(emp);
		return new ResponseEntity<String>("Employee details updated", HttpStatus.OK);
	}
	
}
