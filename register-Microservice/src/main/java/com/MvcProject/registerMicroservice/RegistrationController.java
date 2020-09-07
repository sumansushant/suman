package com.MvcProject.registerMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



import com.MvcProject.LoginMicroservice.model.UserRepo;


@Controller
public class RegistrationController {
	
	@Autowired
    UserRepo userRepo;
	
	@RequestMapping(value="/")
	public String CheckMVC() {
		return "Working";
	}
	
	

}
