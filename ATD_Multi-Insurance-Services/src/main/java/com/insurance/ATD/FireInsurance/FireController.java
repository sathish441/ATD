package com.insurance.ATD.FireInsurance;
import java.io.*;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@GetMapping(value="/firedetails")
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
	
	int unit,tens,hundred;
	unit=(int)amt%10;
	int ut = (int)amt/10;
	tens = ut%10;
	hundred =(int) amt/100;
	String[]u= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String[]at = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	String h = "Hundred";
	
	String z = u[hundred]+" "+h+" and "+at[tens]+" "+u[unit];
	
	mav.addObject("calc",c);
	mav.addObject("amt",amt);
	mav.addObject("a",a);
	mav.addObject("word",z);
	return mav;
	

	
}
@PostMapping(value="deletedetails")
public String delete(@RequestParam int PolicyNumber) {
	 repo.deleteById(PolicyNumber);
	 return "FireOptions";
}
@PostMapping(value="updatepolicy")
public ModelAndView updates(Firebean f,@RequestParam int PolicyNumber,int Amount,int Tenure, int percentage, String Materials) {
	ModelAndView mv = new ModelAndView("FireOptions");
	f.setMaterials(Materials);
	f.setAmount(Amount);
	f.setPolicynumber(PolicyNumber);
	f.setPercentage(percentage);
	f.setTenure(Tenure);
	repo.save(f);
	mv.addObject("fire",f);
	return mv ;
}
@GetMapping(value = "allresults")
public ModelAndView fetch() {
	ModelAndView mp = new ModelAndView("FireCalcs");
	Collection<Firebean>fb=(Collection<Firebean>) repo.findAll();
	mp.addObject("fire",fb);
	return mp;
}
@PostMapping(value="Serialise")
public String encript() {
try {
	ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("Serialisable.txt"));
	Collection<Firebean>fb=(Collection<Firebean>) repo.findAll();
	String h = fb.toString();
	oos.writeChars(h);
	oos.close();
} catch (IOException e) {
	e.printStackTrace();
}
	return "FireOptions";
}
@GetMapping(value="claimpolicy")
public ModelAndView claim(Firebean fb,@RequestParam int PolicyNumber,double percent ) {
	ModelAndView mav = new ModelAndView("FireCalcs");
   fb= repo.findById(PolicyNumber).orElse(new Firebean());
   int amt=(int) fb.getAmount();
   double ten =(int) fb.getTenure();
   double per = (int)fb.getPercentage();
   percent = (double)percent/100;
   double claim = amt*percent;
   double remaining = amt-claim;
   
   mav.addObject("claim",claim);
   mav.addObject("remaining",remaining);
   mav.addObject("amt",amt);
   return mav;
}

}
