package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("employees", employeeRepository.findAll());
		return "/list/list";
	}
	
	@RequestMapping("/list/empName")
	public String showEmployeesListByEmpNameLike(@RequestParam("empName") String empName,Model model) {
		model.addAttribute("employees", employeeRepository.findByEmpNameContaining(empName));
		return "/list/list";
	}
	
//	@RequestMapping("back/to/top/message")
//	public String backToMessage(HttpSession session,String inputEmpName) {
//		String empName=(String)session.getAttribute("empName");
//		if (inputEmpName!=null&&inputEmpName.equals(empName)) {
//			return "/list/empName";
//		}
//		return "back/to/top/message";
//		
//	}
	
	
//	@RequestMapping("back_to_top_message")
//	public String backToMessage(HttpSession session,Model model) {
//		String empName=(String)session.getAttribute("empName");
//		String massage="該当する社員が存在しません";
//		session.removeAttribute("empName");
//		model.addAttribute("message", massage);
//		return "/list/list";
//	}
	

}
