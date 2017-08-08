package com.chaocharliehuang.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloHuman {
	@RequestMapping("")
	public String index(@RequestParam(value="firstName", defaultValue="Human") String firstName, 
			@RequestParam(value="lastName", required=false) String lastName, Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "index";
	}
}
