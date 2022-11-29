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
	
//Insert
	@RequestMapping(value="PolicyHolderActions")
	public String PolicyHolderActions1() {
		return "LifePolicyHolderActions";
	}
	@RequestMapping(value="takeAPolicy")
	public String LifeInsurance() {
		return "LifeOptions";
	}
	@RequestMapping(value="optionsPage")
	public String OptionsPage() {
		return "WholeLifeCover99Years";
	}
	@PostMapping(value="fromWholeLife")
	public String UserOptionsPage(LifeOptionsBean lob) {
		lifeRepo2.save(lob);
		return "LifePolicyHolderDetails";
	}
	@PostMapping(value="userDetailsSave")
	public String UserDetails(LifeBean lb) {
		lifeRepo.save(lb);
		return "LifeUserPolicityResults";
	}
//Clear upto here
	//Search
	@RequestMapping(value="SearchPolicyDetails")
	public String SearchDetails() {
		return "LifeSearch";
	}
	@PostMapping(value="SearchInput")
	public ModelAndView TakenSearchInput(@RequestParam int sno) {
		ModelAndView mav = new ModelAndView("LifeUserPolicyResults");
		LifeBean lb = lifeRepo.findById(sno).orElse(new LifeBean());
		mav.addObject("searchResult1",lb);
		
		return mav;
	}
	

	
	
	@PostMapping(value="userPolicyResults")
	public ModelAndView UserPolicyResults(LifeBean lb) {
		ModelAndView mav = new ModelAndView();
		lb.getFullname();
		lb.getAge();
		lb.getDob();
		lb.getPermanentAddress();
		
		mav.setViewName("userPolicyResults");
		mav.addObject("policyResult", lb);
		return mav;
	}
	@PostMapping(value="userPolicyResults2")
	public ModelAndView UserPolicyResults2(LifeOptionsBean lob) {
		ModelAndView mav = new ModelAndView();
		lob.getInstalmentProcess();
		lob.getPolicyType();
		lob.getPolicyTenure();
		lob.getPolicyAmountPerMonth();
		mav.setViewName("userPolicyResults");
		mav.addObject("policyResult", lob);
		return mav;
		
	}
	
}
