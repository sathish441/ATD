package com.insurance.ATD.FireInsurance;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@GetMapping(value = "calculateintrest")
public ModelAndView intrest(@RequestParam int Amount, int Tenure, int percentage) {
	ModelAndView mav = new ModelAndView("FireCalcs");
	int a = (int)Amount;
	double t = (double)Tenure/12;
	double p = (double)percentage/100;
	double c = a*t*p;
	double amt = a+c;
	mav.addObject("calc",c);
	mav.addObject("amt",amt);
	mav.addObject("a",a);
	return mav;
}
@PostMapping(value="deletedetails")
public String delete(@RequestParam int PolicyNumber) {
	 repo.deleteById(PolicyNumber);
	 return "FireOptions";
}
@PostMapping(value="updatepolicy")
public String updates(Firebean f,@RequestParam int PolicyNumber) {
	
PolicyNumber=f.getPolicynumber();
	repo.save(f);
	return "FireOptions";
}
@GetMapping(value = "allresults")
public ModelAndView fetch() {
	ModelAndView mp = new ModelAndView("FireCalcs");
	Collection<Firebean>fb=(Collection<Firebean>) repo.findAll();
	mp.addObject("fire",fb);
	return mp;
}
}
