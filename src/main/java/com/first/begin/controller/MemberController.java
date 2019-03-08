package com.first.begin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.first.begin.domain.Member;
import com.first.begin.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list",service.getList());
	}
	
	@PostMapping("/register")
	public String register(Member member, RedirectAttributes rttr) {
		service.register(member);
		rttr.addFlashAttribute("result",member.getMno());
		return "redirect:/member/list";
	}
	
	@GetMapping("/get")// @RequestParam 생략해도 무방
	public void get(@RequestParam("mno") int mno, Model model) {
		model.addAttribute("member",service.get(mno));
	}
	
	@PostMapping("/modify")
	public String modify(Member member, RedirectAttributes rttr) {
		if(service.modify(member)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/member/list";
	}
	
	@PostMapping("/delete")
	public String remove(int mno, RedirectAttributes rttr) {
		if(service.remove(mno)) {
			rttr.addAttribute("result","success");
		}
		return "redirect:/member/list";
	}
	
	@GetMapping("/login")
	public void log() {
	}
	
	@PostMapping("/login")
	public String login(String id, String password) {
		Member m = service.getById(id);
		
		if(m == null) {
			return "redirect:/member/login";
		}
		
		if(m.getPassword().equals(password)) {
			return "redirect:/member/list";
		}else {
			return "redirect:/member/login";
		}
		
	}
	
	
}
