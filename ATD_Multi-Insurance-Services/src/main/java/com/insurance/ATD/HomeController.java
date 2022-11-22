package com.insurance.ATD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Homepage() {
    String views = "home";
		return views;
	}
}
//1 Fire insurance - Aswin

//2 Life insurance - Madhubabu

//3 water/merin insurance - Anji

//4 child insurance - Arun

//5 pet insurance - Saleem

//6 electric insurance - Abraham

//7 Vehicle insurance - Dileep

//8 cyber attack insurance - ?

//9 property insurance - ?

//10 Home insurance - Sivakumar

//11 Education insurance - Sai Kiran

//12 Mobile insurance - Krishna

//13 Insurance on Electrical Equipments - ?

//14 Gold Insurance - Madhukar

//15 Hotel Insurance - Geetha

//16 Crop Insurance - Kiran
