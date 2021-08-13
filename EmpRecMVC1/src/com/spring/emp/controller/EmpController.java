package com.spring.emp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.emp.dto.EmployeeDTO;
import com.spring.emp.model.EmpModel;

@Controller
public class EmpController {
	private EmpModel em;
	public EmpModel getEm() {
		return em;
	}
	@Autowired(required=true)
	public void setEm(EmpModel em) {
		this.em = em;
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView geteployeeDetails() {
		List<EmployeeDTO> list =  getEm().getemploeeDetails();
		Map<String, List<EmployeeDTO>> map = new HashMap<String, List<EmployeeDTO>>();
		map.put("emp", list);
		return new ModelAndView("detail", map);
	}

}
