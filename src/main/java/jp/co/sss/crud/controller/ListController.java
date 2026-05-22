package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.crud.repository.EmployeeRepository;

@Controller

public class ListController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/")
	public String login() {
		return "/";
	}
	
	@RequestMapping("/list")
	public String showList(Model model) {
		model.addAttribute("list", employeeRepository.findAll());
		return "/list/list";
	}

}
