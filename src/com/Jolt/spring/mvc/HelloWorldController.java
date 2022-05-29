package com.Jolt.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// controller method to read form data and 
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String shoutName(HttpServletRequest request, Model model) {
		
		// read the request parameter
		String name = request.getParameter("studentName");
		
		// convert data to all upper case
		name = name.toUpperCase();
		
		// create the message
		String result = "Hi " + name;		
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
