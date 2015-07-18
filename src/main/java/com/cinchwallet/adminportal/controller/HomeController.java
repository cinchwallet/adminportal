package com.cinchwallet.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cinchwallet.adminportal.constant.Constants;
import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService dataService;

	@RequestMapping("home")
	public String getForm(Model model) {
		return Constants.PAGE_HOME;
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Employee employee) {
		dataService.save(employee);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList() {
		List employeeList = dataService.getList();
		return new ModelAndView("list","employeeList",employeeList);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.delete(id);
		return new ModelAndView("redirect:list");
	}
	
	
	@RequestMapping("adminform")
	public String getAdminForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "adminform";
	}

	@RequestMapping("admintable")
	public String getAdminTable(Model model) {
		return "table";
	}

}
