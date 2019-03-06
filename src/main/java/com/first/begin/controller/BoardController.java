package com.first.begin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.begin.domain.Board;
import com.first.begin.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list.bgn")
	public String listboard(Model model) {
		
		List<Board> s = boardService.getList();
		
		for(Board t : s) {
			System.out.println(t.getBno()+" / "+t.getTitle()+" / "+t.getContent()+" / "+t.getWriter());
		}
		
		model.addAttribute("list",boardService.getList());
		
		return "list";
	}
}
