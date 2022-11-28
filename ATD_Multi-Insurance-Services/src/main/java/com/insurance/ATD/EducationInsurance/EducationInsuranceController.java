package com.insurance.ATD.EducationInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EducationInsuranceController {

	@Autowired
	EducationInsuranceRepo eirepo;

	@RequestMapping(value = "EducationInsurance")
	public String EducationInsurance() {
		return "EducationInsurance";
	}

	@RequestMapping("/Eduinsurdetails")
	public String details(Educationbean educationbean) {
		eirepo.save(educationbean);
		return "EducationInsurance";
	}

	@RequestMapping("/GetEduinsurdetails")
	public ModelAndView getdetails(@RequestParam int policynumber) {
		ModelAndView mode = new ModelAndView();
		Educationbean edubean = eirepo.findById(policynumber).orElse(new Educationbean());
		mode.addObject("edbe", edubean);
		mode.setViewName("EducationInsurance");
		return mode;
	}
	
	@GetMapping(value = "/calculation")
	public ModelAndView calculationofinterest(@RequestParam int Tenure, int Percentage, String Amount) {
		ModelAndView mode = new ModelAndView();
		double T = (double)Tenure * 12;
		double P = (double)Percentage / 8.3333;
		String Am = Amount.replaceAll(",","");
		int A = Integer.parseInt(Am);
		double i = 1+P;
		double j = T-1;
		
		double Num = Math.pow(i, T);
		double Den = j;
		
		double cal =  (A * P * Num) / Den ;
		
		System.out.println(T);
		System.out.println(P);
		System.out.println(A);
		System.out.println(cal);
		mode.addObject("Calcula", cal);
		mode.setViewName("EducationInsurance");
		return mode;
		
		
	}
	
	@RequestMapping("/EducationInsurane/{policynumber}")
	public ModelAndView deleteById(@RequestParam int policynumber) {
		eirepo.deleteById(policynumber);
		return new ModelAndView("EducationInsurance");
	}

	
}
