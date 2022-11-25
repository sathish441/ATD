package com.insurance.ATD.HotelInsurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HotelController {
Hotelrepo repo;

@RequestMapping(value="Hotel")
public String Hotel(){
	return "HotelCustomers";
}
@PostMapping(value="/HotelCustomers")
public String Data(HotelBean HB){
	repo.save(HB);
	return "home";

}
}