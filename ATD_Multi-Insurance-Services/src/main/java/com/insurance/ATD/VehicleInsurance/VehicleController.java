package com.insurance.ATD.VehicleInsurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {
VehicleRepo vehiclerepo;

@RequestMapping (value="VehicleInsuranceBean")
public String VehicleInsurance() {
	return "Vehicletype";
	
}

@PostMapping(value="/VehicleInput")
public String Inputs(VehicleBean vb) {
	vehiclerepo.save(vb);
	return "Home";
	
}
	
}
