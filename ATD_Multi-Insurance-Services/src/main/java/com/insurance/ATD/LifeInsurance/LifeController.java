package com.insurance.ATD.LifeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LifeController {
	@Autowired
	LifeRepo lifeRepo;
	@Autowired
	LifeRepo2 lifeRepo2;
	
//Home to Insurance
	@RequestMapping(value="PolicyHolderActions")
	public String PolicyHolderActions1() {
		return "LifePolicyHolderActions";
	}
//to Policy page
	@RequestMapping(value="takeAPolicy")
	public String LifeInsurance() {
		return "LifeOptions";
	}
//to selected page
	@RequestMapping(value="optionsPage")
	public String OptionsPage() {
		return "WholeLifeCover99Years";
	}
//save the policy details
	@PostMapping(value="fromWholeLife")
	public String UserOptionsPage(LifeOptionsBean lob) {
		lifeRepo2.save(lob);
		return "LifePolicyHolderDetails";
	}
//save the user details
	@PostMapping(value="userDetailsSave")
	public String UserDetails(LifeBean lb) {
		lifeRepo.save(lb);
		return "LifeSearch";
	}
//redirect to Search page
	@RequestMapping(value="SearchPolicyDetails")
	public String SearchDetails() {
		return "LifeSearch";
	}
//Mapping from Search JSP to result view
	@GetMapping(value="SearchInput")
	public ModelAndView TakenSearchInput(@RequestParam int sno) {
		ModelAndView mav = new ModelAndView("LifeUserPolicyResults");
		LifeBean lb = lifeRepo.findById(sno).orElse(new LifeBean());
		LifeOptionsBean lb2 = lifeRepo2.findById(sno).orElse(new LifeOptionsBean());
		
		mav.addObject("searchResult1",lb);
		mav.addObject("searchResult2",lb2);
		return mav;
	}
//Mapping to Home from Search page
	@RequestMapping(value="home")
	public String toHome() {
		return "home";
	}
//Mapping for Update
	@RequestMapping(value="updatePolicyDetails")
	public String FromUpdatePage() {
		return "LifeUpdatePolicyDetails";
	}
//Mapping for Delete
	@RequestMapping(value="withdrawFromAPolicy")
	public String FromWithdrawFromAPolicy() {
		return "LifeWithdrawFromAPolicy";
	}
//Search & Update from Update page
	@PostMapping(value="searchFromUpdatePage")
	public ModelAndView SearchFromUpdatePage(@RequestParam int sno) {
		ModelAndView mav = new ModelAndView("LifeUpdatePolicyDetails");
		LifeBean lb = lifeRepo.findById(sno).orElse(new LifeBean()); 
		LifeOptionsBean lb2 = lifeRepo2.findById(sno).orElse(new LifeOptionsBean());
		
		mav.addObject("searchResult1",lb);
		mav.addObject("searchResult2",lb2);
		
		return mav;
	}
	@PostMapping(value="fromWithdraw")
	public ModelAndView FromWithdrawPage(@RequestParam int sno) {
		ModelAndView mav = new ModelAndView("LifeWithDrawd");
		lifeRepo.deleteById(sno);
		lifeRepo2.deleteById(sno);
		
		return mav;
	}
	@PostMapping(value="fromUpdate")
	public ModelAndView FromUpdate(@RequestParam String fullName, String age, String dob, String permanentAddress, 
			String policyType, String policyAmountPerMonth, String instalmentProcess, String policyTenure) {
		LifeBean lb = new LifeBean();
		lb.setFullname(fullName);
		lb.setAge(age);
		lb.setDob(dob);
		lb.setPermanentAddress(permanentAddress);
		lifeRepo.save(lb);
		LifeOptionsBean lb2 = new LifeOptionsBean();
		lb2.setPolicyType(policyType);
		lb2.setPolicyAmountPerMonth(policyAmountPerMonth);
		lb2.setInstalmentProcess(instalmentProcess);
		lb2.setPolicyTenure(policyTenure);
		lifeRepo2.save(lb2);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("LifeUpdatedResult");
		mav.addObject("result1", lb);
		mav.addObject("result2", lb2);
		return mav;
	}
	}


			
	
	

