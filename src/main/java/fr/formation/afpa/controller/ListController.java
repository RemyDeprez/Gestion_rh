package fr.formation.afpa.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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


	@GetMapping("/")
	public String getHome(Model model) {

		return "home";

	}
	@GetMapping("/gethome")
	public String getHome2(Model model) {

		return "redirect:/";

	}
	@GetMapping("/getemployeeonly")
	public String getEmployeeOnly(Model model) {
		List<Employee> list = service.findEmployee();
		model.addAttribute("listEmployee", list);
		return "listemployeeonly";

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
		return "addemployee";

	}
	
	@GetMapping("/getwho")
	public String getWho(Model model) {
		return "whoami";

	}
	@GetMapping("/getcontact")
	public String getContact(Model model) {
		return "contact";

	}

	@GetMapping("/getsettings")
	public String getSettings(Model model) {
		List<Employee> list = service.findUnManaged();
		model.addAttribute("listUnManaged", list);
		List<Employee> list2 = service.findManager();
		model.addAttribute("listManager", list2);
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
	@RequestMapping(path="/getupdateform", method=RequestMethod.GET)
	public String getHome(@ModelAttribute Employee emp) {
		return"updateemployee";
	}
	
	
	
	
	@PostMapping(path="/doupdate")
	public String doUpdate(@ModelAttribute ("employee") Employee emp, ModelMap model) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatteddate = simpleDateFormat.format(emp.getStartDate());
		System.out.println(formatteddate);
		model.addAttribute("firstName", emp.getFirstName());
		model.addAttribute("lastName", emp.getLastName());
		model.addAttribute("startDate", formatteddate);
		model.addAttribute("title", emp.getTitle());
		model.addAttribute("employee", emp.getEmployee());
		service.update(emp);
		return"listemployeeonly";
	}
	
	
	
	
	
	
	
	@GetMapping("/updateemployee/{id}")
	public ModelAndView updateEmployee (@PathVariable Integer id , ModelMap modelMap) {
		
		System.out.println(id);
		Employee emp =service.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/getupdateform");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatteddate = simpleDateFormat.format(emp.getStartDate());
		
		mv.addObject("startDate", formatteddate);

		mv.addObject("empId", emp.getEmpId());
		mv.addObject("title", emp.getTitle());
		mv.addObject("firstName", emp.getFirstName());
		mv.addObject("lastName", emp.getLastName());
		mv.addObject("department", emp.getDepartment());
			return mv;
	}
	@GetMapping("/deleteemployee/{id}")
	public String deleteEmployee (@PathVariable int id , ModelMap modelMap) {
		
		System.out.println(id);
		service.deleteById(id);
		return "redirect:/getemployeeonly";
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
