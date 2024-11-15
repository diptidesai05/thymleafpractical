package com.thymeleaf.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("inside about");
		model.addAttribute("name","Dipti Desai");
		model.addAttribute("currentDate", new Date());
		return "about";
	}

	@GetMapping("/iterate")
	public String iterateHandler(Model model) {
		
		//List of names
		List<String> names = List.of("Stefu","Guru","Japi","Mocha");
		model.addAttribute("names",names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model model) {
		
		System.out.println("ConditionalHandler");
		//List of names
				List<String> names = List.of("Stefu","Guru","Japi","Mocha");
				model.addAttribute("names",names);
		model.addAttribute("isActive",false);
		model.addAttribute("gender", "female");
		List<Integer> list1 = List.of(120,562,256,147);
		model.addAttribute("mylist", list1);
		return "condition";
	}
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		
		System.out.println("service handlder");
		model.addAttribute("title", "I like to eat kombdi wade");
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
	}
	
	@GetMapping("/newAbout")
	public String newAbout() {
		System.out.println("in newabout");
		return "about_new";
	}
}
