package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // mandatroy class level annoto specify:
//class=> spring bean:req handling controller (=Handler),singleton
public class TestController {
	public TestController() {
		System.out.println("int ctor of" + getClass());
	}

	// add req handling method to display welcome mesg to clnt
	@RequestMapping("/test")
	// mandatory method level anno--
	// HandlerMapping bean ,key:/test
	// value : com.app.controller.TestController.testMe1
	public String testMe1() {
		System.out.println("in testMe1");
		return "/display";// AVN:/WEB-INF/views/display.jsp
		// (Handler -->avn-->D.S)
	}
}
