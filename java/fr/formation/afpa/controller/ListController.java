package fr.formation.afpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.afpa.domain.Employee;
import fr.formation.afpa.service.EmployeeService;

@Controller
public class ListController {
	EmployeeService service;

	@Autowired
	public ListController(EmployeeService service) {
		this.service = service;
	}

	public ListController() {

	}

	@GetMapping("/")
	public String getHome(Model model) {

		return "home";

	}
//	Methode lancée a la connection pour renvoyer vers la liste avecla liste d'employee
	@GetMapping("/getlist")
	public String getList(Model model) {
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		System.out.println(list);
		return "globallist";
	}
	//methode lancée au click de l'action "ajout d'employee"
	@GetMapping("/addemployee")
	public String addEmployee(Model model) {

		return "addemployee";

	}
}
