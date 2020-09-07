package com.MvcProject.LoginMicroservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MvcProject.LoginMicroservice.model.User;
import com.MvcProject.LoginMicroservice.model.UserRepo;


@Controller
public class LoginController {
	
	@Autowired
    UserRepo userRepo;
	
	@GetMapping(value="/")
	public String CheckMVC() {
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String loginHomePage(@RequestParam("UserId") int UserId,@RequestParam("password") String password,Model model) 
	{
		User u = null;
		try {
			u=userRepo.findById(UserId).orElse(null);
		}
		catch (Exception e) {
		System.out.println("User Not Found !!!");
		}
		if(u!=null) {
		model.addAttribute("UserId",UserId);
		return "homePage";
		}
		model.addAttribute("error", "User not found");
		return  "dashboard";
	}
	
	@RequestMapping("/register")
	public String goToRegistrationPage() {
	
		return "register";
	}
	
	@RequestMapping("/set-user")
	public String goToRegisterMicroservice() {
	//code to go 
		return "login";
	}
	

}
