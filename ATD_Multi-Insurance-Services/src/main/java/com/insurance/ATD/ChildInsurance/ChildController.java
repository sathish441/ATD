package com.insurance.ATD.ChildInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChildController {
	@Autowired
	ChildRepo childrepo;

	@RequestMapping(value = "/ChildHome")
	public String inputs() {
		return "ChildHome";
	}

	@PostMapping(value = "/childentry")
	public String childentry(ChildBean cb) {
		childrepo.save(cb);
		return "ChildHome";

	}
	
	@GetMapping(value="/details")
	public  ModelAndView Details(@RequestParam Integer FullName) 
	{
    ModelAndView mav=new ModelAndView("ChildDetails");
    ChildBean cb = childrepo.findById(FullName).orElse(new ChildBean());
	mav.setViewName("ChildDetails");
	mav.addObject("details",cb);
	return mav;
	}
}
