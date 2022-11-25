package com.insurance.ATD.HomeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
	Customerrepository repo;
	
	@RequestMapping(value="customers")
	public String costumers() {
		return "customers";
	}
	@PostMapping(value="/customers")
	public String customers(Homebean homebean) {
		repo.save(homebean);
		return "customersdetails";
	}
	@RequestMapping(value="customersdetails")
	public String getcustomers() {
		return "customersdetails";
	}

	@PostMapping(value="searchdetails")
	public ModelAndView searchdetails(@RequestParam int PolicyNumber) {
		ModelAndView mv = new ModelAndView("customersdata");
		Homebean homebean = repo.findById(PolicyNumber).orElse(null);
		mv.addObject(homebean);
		return mv;
		

	}

}
