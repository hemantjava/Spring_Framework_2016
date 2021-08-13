package com.mvc;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class WelcomeController {  
    @RequestMapping("/welcome.html")  
    public ModelAndView helloWorld() {  
        String mege = "WELCOME SPRING MVC HOW R U WITH HEMANT SAHU";  
                              //1.jsp filename " 2.logical name that is read from jsp page    " 3.ur String object
        return new ModelAndView("welcome", "sonu", mege);  
    }  
}  