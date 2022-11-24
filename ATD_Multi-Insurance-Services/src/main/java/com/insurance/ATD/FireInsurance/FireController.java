package com.insurance.ATD.FireInsurance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FireController {
	@Autowired
FireRepo repo;

@RequestMapping(value="FireInsurance")
public String FireInsurance(){
	return "FireOptions";
}
@PostMapping(value="/fireinputs")
public String inputs(Firebean fb){
	repo.save(fb);
	return "home";
}
@GetMapping(value="firedetails")
public ModelAndView details(@RequestParam int PolicyNumber) {

	ModelAndView mav = new ModelAndView("FireCalcs");
	//Firebean fb = repo.findById(PolicyNumber).orElse(null);
	Firebean fb = repo.findById(PolicyNumber).orElse(new Firebean());
	
	mav.addObject("fire", fb);
	
	return mav;
	
}

}
