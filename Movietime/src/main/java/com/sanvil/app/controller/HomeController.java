package com.sanvil.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
}