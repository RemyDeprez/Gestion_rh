package fr.formation.afpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class IndexController {
	@Autowired(required=false)
	String login;
	
	@Autowired(required=false)
	String password;
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getHome(Model model, @RequestParam String login, @RequestParam String password) {
		if(login.equals("root") && password.equals("123456")) {
			return"globallist";
		}
		else {
			return "home";
		}
	}
}

