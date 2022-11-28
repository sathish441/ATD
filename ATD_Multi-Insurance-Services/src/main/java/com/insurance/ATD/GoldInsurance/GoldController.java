package com.insurance.ATD.GoldInsurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoldController {
	@RequestMapping(value="goldpageopening")
	public String  goldPage() {
		String views="gold";
		return views;
	}

}
