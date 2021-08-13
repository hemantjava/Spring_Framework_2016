package com.stu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stu.model.dto.StudentDTO;
import com.stu.service.StudentService;

@Controller
public class StudentController {
	private StudentService ss;
	private StudentDTO std;
    @Autowired
	public void setStd(StudentDTO std) {
		this.std = std;
	}
    @Autowired
	public void setSs(StudentService ss) {
		this.ss = ss;
	}

	public StudentService getSs() {
		return ss;
	}

	@RequestMapping("/insert")
	public ModelAndView insertRequest(HttpServletRequest req,
			HttpServletResponse hsrs) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String adds = req.getParameter("adds");
		std.setSid(id);
		std.setSname(name);
		std.setAddrs(adds);
		ss.insertRecord(std);

		return new ModelAndView("insertjsp", "id", std);
	}

	@RequestMapping("/select")
	public ModelAndView selectRequest(HttpServletRequest req,
			HttpServletResponse hsrs) {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDTO sst = ss.getRecord(id);
		return new ModelAndView("selectjsp", "id", sst);

	}

	@RequestMapping("/selectall")
	public ModelAndView selectAllRequest(HttpServletRequest req,
			HttpServletResponse hsrs) {
		List<StudentDTO> list = ss.getRecordAll();
		return new ModelAndView("selectalljsp", "id", list);
	}

	@RequestMapping("/delete")
	public ModelAndView deleteRequest(HttpServletRequest req,
			HttpServletResponse hsrs) {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDTO st=ss.deleteStudent(id);

		return new ModelAndView("deletejsp", "id", st);
	}

	@RequestMapping("/update")
	public ModelAndView updateRequest(HttpServletRequest req,
			HttpServletResponse hsrs) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String adds = req.getParameter("adds");

		std.setSid(id);
		std.setSname(name);
		std.setAddrs(adds);
		ss.updateStudent(std);
		return new ModelAndView("updatejsp", "id", std);
	}

}
