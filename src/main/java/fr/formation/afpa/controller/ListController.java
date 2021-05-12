package fr.formation.afpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.formation.afpa.domain.Employee;
import fr.formation.afpa.service.EmployeeService;

@Controller
public class ListController {
	
	@Autowired
	
	EmployeeService service;

	@Autowired
	public ListController(EmployeeService service) {
		this.service = service;
	}

	public ListController() {

	}

    
    @RequestMapping(value  ="/save", method = RequestMethod.GET)
    public String initAdd(ModelMap modelMap) {
    	modelMap.addAttribute("employee", new Employee());
		return null;
    	
    }

	@GetMapping("/")
	public String getHome(Model model) {

		return "home";

	}
	@GetMapping("/gethome")
	public String getHome2(Model model) {

		return "redirect:/";

	}
	
	@GetMapping("/getmanager")
	public String getGlobalList(Model model) {
		List<Employee> list = service.findManager();
		model.addAttribute("listEmployee", list);
		System.out.println(list);
		return "listmanager";
	}
	
	@GetMapping("/getaddform")
	public String getAddForm(Model model) {
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		return "addemployee";

	}
	@GetMapping("/getupdateform")
	public String getUpdateForm(Model model) {
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		return "updateemployee";

	}
	@GetMapping("/getwho")
	public String getWho(Model model) {
		return "whoami";

	}
	@GetMapping("/getcontact")
	public String getContact(Model model) {
		return "contact";

	}
	@GetMapping("/getemployeeonly")
	public String getEmployeeOnly(Model model) {
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		return "listemployeeonly";

	}
	@GetMapping("/getsettings")
	public String getSettings(Model model) {
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		return "settings";

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
	public String addEmployee(ModelMap modelMap, Model model) {
		modelMap.addAttribute("employee", new Employee());
		List<Employee> listManager = service.findManager();
		model.addAttribute("listManager", listManager);
		
		return "addemployee";

	}
	@GetMapping("/deleteemployee")
	public String deleteEmployee (@ModelAttribute("employee")Employee employee, ModelMap modelMap) {
		
		service.deleteById(employee.getEmpId());
		
		
		return "globallist";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee employee,  ModelMap model) {
		
		Employee emp = new Employee();
		model.addAttribute("firstName", employee.getFirstName());
		model.addAttribute("lastName", employee.getLastName());
		model.addAttribute("startDate", new Date());
		model.addAttribute("title", employee.getTitle());
		model.addAttribute("employee", employee.getEmployee());
//		model.addAttribute("department", employee.getDepartment());
		
		emp.setFirstName(employee.getFirstName());
		System.out.println(emp);
		System.out.println(employee);
		emp.setLastName(employee.getLastName());
		emp.setStartDate(new Date());
		emp.setTitle(employee.getTitle());
		emp.setEmployee(employee.getEmployee());
//		emp.setDepartment(employee.getDepartment());
		service.save(emp);
		List<Employee> list = service.findAll();
		model.addAttribute("listEmployee", list);
		return "globallist";
	}
	
	
}
