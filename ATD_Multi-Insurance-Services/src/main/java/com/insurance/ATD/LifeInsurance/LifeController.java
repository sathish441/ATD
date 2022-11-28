package com.insurance.ATD.LifeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LifeController {
	@Autowired
	LifeRepo lifeRepo;
	
	@RequestMapping(value="LifeInsurance")
	public String LifeInsurance() {
		return "LifeOptions";
	}
	@RequestMapping(value="optionsPage")
	public String OptionsPage() {
		return "WholeLifeCover99Years";
	}
	@RequestMapping(value="userDetails")
	public String UserDetails() {
		return "LifePolicyHolderDetails";
	}
	
	@RequestMapping(value="FilledUserDetails")
	@GetMapping
	public String filledUserDetails(LifeBean lb) {
		lb.setFullName("fullname");
		lb.setAge("age");
		lb.setDob("dob");
		lb.setPermanentAddress("permanentAddress");
		
		return "home";
	}
}
