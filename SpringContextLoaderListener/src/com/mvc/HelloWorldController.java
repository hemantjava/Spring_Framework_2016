package com.mvc;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String mege = "spring servlet cfg1 file must be 'servlet name'-servlet.xml";  
                              //1.jsp filename " 2.logical name    " 3.ur String object
        return new ModelAndView("cfgmsg", "son", mege);  
    } 
    
    @RequestMapping("/list")  
    public ModelAndView helloWorld1() {  
        String mege = "spring servlet cfg2 file must be 'servlet name'-servlet.xml";  
                              //1.jsp filename " 2.logical name    " 3.ur String object
        return new ModelAndView("cfgmsg", "son", mege);  
    } 
   
}  