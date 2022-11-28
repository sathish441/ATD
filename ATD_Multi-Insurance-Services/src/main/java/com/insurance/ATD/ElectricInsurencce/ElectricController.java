package com.insurance.ATD.ElectricInsurencce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElectricController {
	@RequestMapping(value="electricpageopenining")
	public String Electricpage() {
		String views = "Electric";
		return views;
		
	}

}
