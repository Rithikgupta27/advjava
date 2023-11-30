package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Department;
import com.app.service.DepartmentService;

@Controller
public class DepartmentController {

	public DepartmentController() {
		System.out.println("dept Contrllr constr" + getClass());
	}

	@Autowired
	private DepartmentService dept_ser;

//handler-->dispatcher-->list.jsp
	// mappedofModel atrribute
	@RequestMapping("/dept_list")
	public String DepartmentList(Model modelAttrMap) {
		System.out.println("method inside dept controller :department list");
		List<Department> listAllDepartments = dept_ser.listAllDepartment();
		modelAttrMap.addAttribute("dept_list", listAllDepartments);
		return "/list";// AVN

	}

}
