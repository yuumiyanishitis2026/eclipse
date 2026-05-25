package jp.co.sss.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.crud.form.EmployeeForm;

@Controller

public class RegistrationController {
	
	@GetMapping("/regist/input")
	public String registInput(@ModelAttribute EmployeeForm form) {
		return"regist/regist_input";
	}
	
	@PostMapping("/regist/check")
	public String registCheck(@ModelAttribute EmployeeForm form,Model model) {
		model.addAttribute("employeeForm", form);
		return "regist/regist_check";
	}
	@PostMapping("/regist/back")
	public String registBack(@ModelAttribute EmployeeForm form,Model model) {
		model.addAttribute("employeeForm", form);
		return "regist/regist_input";
	}
	@PostMapping("/regist/complete")
	public String registComplete(@ModelAttribute EmployeeForm form,Model model) {
		model.addAttribute("employForm", form);
		return "regist/regist_complete";
	}
	
	

}
