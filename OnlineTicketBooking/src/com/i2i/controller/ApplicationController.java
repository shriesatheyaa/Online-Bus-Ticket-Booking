package com.i2i.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.i2i.model.User;
@Controller
public class ApplicationController {
		
	//UserService userService =  new UserService();
	 
	@RequestMapping(value = "/UserLogin")
	public ModelAndView getRegisterForm() {
		/*Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		System.out.println(user.getName());*/
		return new ModelAndView("UserLogin");
	}
	 
	
}
