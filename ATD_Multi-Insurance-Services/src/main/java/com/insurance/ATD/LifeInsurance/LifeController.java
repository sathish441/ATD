package com.insurance.ATD.LifeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LifeController {
	@Autowired
	LifeRepo lifeRepo;
	
	@RequestMapping(value="LifeInsurance")
	public String LifeInsurance() {
		return "LifeOptions";
	}
	
}
