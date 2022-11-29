package com.insurance.ATD.HomeInsurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.ATD.FireInsurance.Firebean;

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
}
