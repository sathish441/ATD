package com.insurance.ATD.FireInsurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class FireController {
FireRepo repo;

@RequestMapping(value="FireInsurance")
public String FireInsurance(){
	return "FireOptions";
}
@PostMapping(value="/fireinput")
public String inputs(Firebean fb){
	repo.save(fb);
	return "home";
}
}
