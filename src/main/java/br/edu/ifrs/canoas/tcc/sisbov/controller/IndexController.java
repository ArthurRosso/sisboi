package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
