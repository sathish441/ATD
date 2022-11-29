package com.insurance.ATD.HotelInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	@Autowired
HotelRepo repo;

@RequestMapping(value="HotelInsurance")
public String Hotel(){
	return "Hotel";
}

@PostMapping(value="/HotelData")
public String Data(HotelBean HB){
	repo.save(HB);
	return "home";
}

@GetMapping (value="/HotelSearch")
public ModelAndView Search (@RequestParam int policynumber)
{
	ModelAndView mav = new ModelAndView();
	HotelBean HB = repo.findById(policynumber).orElse(new HotelBean());
	mav.setViewName("HotelResult");
	mav.addObject("SearchResult", HB);
	return mav;
}

@PostMapping (value="/Deleteddata")
public String Delete (@RequestParam int policynumber)

{
	repo.deleteById(policynumber);
	return "home";
}

@GetMapping (value="/Updateddata")
public ModelAndView Update (@RequestParam int policynumber, String fullname, int policyamount, int tenure, float percentage) {
	ModelAndView mav = new ModelAndView();
	HotelBean HB = new HotelBean ();
	HB.setPolicynumber(policynumber);
	HB.setFullname(fullname);
	HB.setPolicyamount(policyamount);
	HB.setTenure(tenure);
	HB.setPercentage(percentage);
	repo.save(HB);
	mav.setViewName("HotelResult");
	mav.addObject("SearchResult", HB);
	return mav;
}


@PostMapping (value="/Calculation")
public ModelAndView Cals (@RequestParam int policyamount, int tenure, float percentage) {
       int a = (int) policyamount;
       double b = (double) tenure/12;
       float c = (float) percentage/100;
       double d = (double) a*b*c;
       double e = (double) a+d;
       ModelAndView mav = new ModelAndView();
       mav.addObject("Principal", a);
       mav.addObject("Interest", d);
       mav.addObject("Time", e);
       mav.setViewName("HotelResult");
       mav.addObject("Calculateddata", e);
       return mav;
}

}