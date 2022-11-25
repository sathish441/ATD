package com.insurance.ATD.EducationInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EducationInsuranceController {
	
	@Autowired
	EducationInsuranceRepo eirepo;
	
	@RequestMapping(value ="EducationInsurance")
	public String EducationInsurance() {
		return "EducationInsurance";
	}
	
	
	@RequestMapping("/Eduinsurdetails")
	public String details(Educationbean educationbean) {
		eirepo.save(educationbean);
		return "EducationInsurance"; 
	}
}
