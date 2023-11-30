package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	public IndexController() {
		System.out.println("in ctor of index" + getClass());
	}
	// add req handling method to dilever index page

	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("in show  home page ");
		return "/index";// handler rets LVN -->D.S -->V.R
	}
}
