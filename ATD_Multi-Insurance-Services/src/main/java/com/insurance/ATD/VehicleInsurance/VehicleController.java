package com.insurance.ATD.VehicleInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.ATD.FireInsurance.Firebean;

@Controller
public class VehicleController {
@Autowired	
VehicleRepo vehiclerepo;

@GetMapping(value="InsuranceHolder") //
public String NewRegister() {
return "InsuranceHolder";
}

@PostMapping(value="/InsuranceHolder")
public String InsuranceHolder(VehicleBean vb) {
	vehiclerepo.save(vb);
	return "VehicleInsuranceSuccessPage";
	
 }

@GetMapping(value="/VehicleInsuranceHolderdetails")
public ModelAndView details(@RequestParam int PolicyHolderNumber) {
	ModelAndView mav = new ModelAndView("Vehicletype");
	VehicleBean vb = vehiclerepo.findById(PolicyHolderNumber).orElse(new VehicleBean());
	mav.addObject("vehicle", vb);
	return mav;
}

}
