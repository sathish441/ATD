package com.insurance.ATD.HomeInsurance;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(value="searchdetails")
	public ModelAndView searchdetails(@RequestParam int PolicyNumber) {
		ModelAndView mv = new ModelAndView("customersdata");
		Homebean homebean = repo.findById(PolicyNumber).orElse(new Homebean());
		mv.addObject(homebean);
		return mv;
	}
	@GetMapping(value="fetchdetails")
	public ModelAndView fetchdetails() {
		ModelAndView mv = new ModelAndView("customersdata");
		List<Homebean> hb = (List<Homebean>)repo.findAll();
		mv.addObject("data",hb);
		return mv;
	}
	@PostMapping(value="deletedata")
	public String deletedata(@RequestParam int PolicyNumber){
		repo.deleteById(PolicyNumber);
		return "home";
	}
	@PostMapping(value="updatedata")
	public String updatedata(Homebean home,int PolicyNumber) {
		repo.save(home);
		return "customersdata";
	}
	@RequestMapping(value="/homeconstructionpolicy")
	public String homeconstructionpolicy() {
		return "homeconstructionpolicy";
	}
	@GetMapping(value="logincheck")
	public ModelAndView logincheck(Homebean home2,@RequestParam int PolicyNumber) {
		ModelAndView mv = new ModelAndView("homeconstructionpolicyentry");
		int Polnum = home2.getPolicyNumber();
		boolean flag = repo.existsById(Polnum);
		mv.addObject(home2);
		Homebean homebean = repo.findById(PolicyNumber).orElse(new Homebean());
		mv.addObject(homebean);
		return mv;
	}
	@Autowired
	CalculationRepo repo2;
	@PostMapping(value="claimcalculation")
	public String claimcalculation(Homecalculation calculation) {
		repo2.save(calculation);
		return "homeconstructionpolicy";
				
		
	}
		
}
