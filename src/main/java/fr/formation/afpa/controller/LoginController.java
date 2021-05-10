package fr.formation.afpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class LoginController {
	@Autowired(required=false)
	String login;
	
	@Autowired(required=false)
	String password;
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getHome(@ModelAttribute String login, @ModelAttribute String password) {
		if(login.equals("root") && password.equals("123456")) {
			return"globallist";
		}
		else {
			return "home";
		}
	}
}
