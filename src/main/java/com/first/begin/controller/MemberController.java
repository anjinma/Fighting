package com.first.begin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.begin.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/member")
	public String list(Model model) {
		
		model.addAttribute("list",service.getList());
		
		return "member";
	}
}
