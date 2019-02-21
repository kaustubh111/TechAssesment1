package com.kaustubh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/Welcome")
	public String mappings()
	{
		return "Cart";
	}
	
	@RequestMapping("/addProduct")
	public String mappings2()
	{
		return "AddProducts";
	}
}
