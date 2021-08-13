package com.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
/* @RequestMapping("/hello.html") */
public class HelloWorldController {

	// approach one

	@RequestMapping(value = "/hello")
	// extension is optional
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("hellopage");// here hellopage jsp
															// page name without
															// extension
		mav.addObject("sonu", "hello silpa pathak");
		// here sonu model name or alias name and "helo silpa is string message"
		return mav;
	}

	//                                approach two
	@RequestMapping(value = "/sonu")
	public ModelAndView sonu() {
		return new ModelAndView("hellopage", "sonu", "hello sonu");
	} 
    //                                approach three
	@RequestMapping(value = "/np")
	public ModelAndView sona() {
		ModelAndView mav = new ModelAndView("hellopage");
		Map<String, String> map = new HashMap<String, String>(); // HashMap<String,?>
		map.put("sonu", "hello nashima parveern");
		mav.addAllObjects(map);
		return mav;
	}
    //                                  approach four
	@RequestMapping(value = "/hemant")
	public ModelAndView hemant() {
		Map<String, String> map = new HashMap<String, String>(); // HashMap<String,?>
		map.put("sonu", "hello hemant sahu");
		return new ModelAndView("hellopage", map);
	}

}