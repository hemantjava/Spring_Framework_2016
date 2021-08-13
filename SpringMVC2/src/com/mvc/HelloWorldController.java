package com.mvc;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class HelloWorldController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String mege = "HELLO SPRING MVC HOW R U WITH HEMANT SAHU";
		// 1.jsp filename " 2.logical name that is read from jsp page    " 3.ur
		// String object
		ArrayList<String> al=new ArrayList<String>();
		al.add("hemant");
		al.add("sonu");
		return new ModelAndView("hellopage", "sonu", al);
	}
}