package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mvc.service.BookService;

/*public class BookListController implements Controller {
 private BookService service;
 @Override
 public ModelAndView handleRequest(HttpServletRequest request,
 HttpServletResponse response) throws Exception {
 System.out.println(getService());
 System.out.println(getService().getBookList());
 ModelAndView mav = new ModelAndView("bookList","list",getService().getBookList());

 return mav;
 }*/
public class BookListController implements Controller {
	private BookService service;
    
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println(getService());
		System.out.println(getService().getBookList());
		ModelAndView mav = new ModelAndView("bookList", "list", getService()
				.getBookList());

		return mav;
	}
    BookListController(){
		System.out.println("Controller 1");

    }
	public BookService getService() {
		return service;
	}

	public void setService(BookService service) {
		this.service = service;
	}
	// Constructors of ModelAndView class
	/*
	 * (1)org.springframework.web.servlet.ModelAndView.ModelAndView();
	 * (2)ModelAndView(String viewName); (3)ModelAndView(String viewName, String
	 * modelName, Object modelObject) (4)ModelAndView(String viewName,
	 * Map<String, ?> model)->(If multiple keys and values)key must be String
	 * and value anytype of object
	 */

	// Methods of ModelAndView class
	// setter methods
	/*
	 * (1)void setViewName(String viewName); (2)ModelAndView setView(View name);
	 */

	// getter methods
	/*
	 * (1)ModelAndView
	 * org.springframework.web.servlet.ModelAndView.addObject(Object
	 * attributeValue); (2)ModelAndView addObject(String attributeName, Object
	 * attributeValue); (3)ModelAndView addAllObjects(Map<String, ?> modelMap);
	 */

	/*
	 * new ModelAndView(); new ModelAndView(String viewnam); new
	 * ModelAndView(String viewnam,Map obj); new ModelAndView(view, modelName,
	 * modelObject);
	 */

}
