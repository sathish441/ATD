package com.insurance.ATD.HomeInsurance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
	@GetMapping("/costumers")
	public String costumers() {
		return "costumers.jsp";
	}

	@PostMapping("/adddetails")
	public String adddetails(@RequestParam("PolicyNumber") String PolicyNumber,
			@RequestParam("Fullname") String Fullname, @RequestParam("Age") String Age,
			@RequestParam("Policyamount") String Policyamount, @RequestParam("Tenure") String Tenure,
			@RequestParam("Percentage") String Percentage, ModelMap modelmap) {
		modelmap.put("PolicyNumber", PolicyNumber);
		modelmap.put("Fullname", Fullname);
		modelmap.put("Age", Age);
		modelmap.put("Policyamount", Policyamount);
		modelmap.put("Tenure", Tenure);
		modelmap.put("Percentage", Percentage);
		return "customersdetails";

	}

}
