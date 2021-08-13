package com.mvc;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
@RequestMapping("/welcome")
public class WelcomeController implements Controller  {  
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		 String mege = "WELCOME SPRING MVC HOW R U WITH HEMANT SAHU";  
         //1.jsp filename " 2.logical name that is read from jsp page    " 3.ur String object
         return new ModelAndView("welcome", "sonu", mege);
	}  
}  