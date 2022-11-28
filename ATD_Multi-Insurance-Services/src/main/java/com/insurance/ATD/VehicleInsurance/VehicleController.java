package com.insurance.ATD.VehicleInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {
@Autowired	
VehicleRepo vehiclerepo;

@RequestMapping (value="VehicleInsuranceBean")   // 
public String VehicleInsurance() {
	return "Vehicletype";
	
}

@PostMapping(value="/VehicleInput")
public String Inputs(VehicleBean vb) {
	vehiclerepo.save(vb);
	return "Home";
	
}
@RequestMapping(value="adddetails")
public String Adddetails(VehicleBean vb) {
	vehiclerepo.save(vb);
	return "Home"; 
}
	
}
