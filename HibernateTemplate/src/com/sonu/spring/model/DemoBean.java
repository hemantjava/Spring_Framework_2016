package com.sonu.spring.model;

import java.util.List;

import com.sonu.spring.dao.CurdDao;

public class DemoBean {
private CurdDao curd;

public void setCurd(CurdDao curd) {
	this.curd = curd;
}
public void insertStudent(int sid,String sname,int marks){
	StudentDTO s=new StudentDTO();
	s.setSid(sid);
	s.setSname(sname);
	s.setMarks(marks);
	curd.save(s);
	System.out.println(s.getSid()+": is inserted..");
}
public void updateStudent(int sid,String sname,int marks){
	StudentDTO s=new StudentDTO();
	s.setSid(sid);
	s.setSname(sname);
	s.setMarks(marks);
	curd.update(s);
	System.out.println(s.getSid()+": is updated with name:"+s.getSname()+" and marks:"+s.getMarks());

}
public void deleteStudent(int sid){
	StudentDTO s=new StudentDTO();
	s.setSid(sid);
	curd.delete(s);
	System.out.println(s.getSid()+": is deleted..");

}
public void ListStudent(){	
	List<StudentDTO> list=curd.findStudent();
	System.out.println("list of employees...");

	for(StudentDTO sdto:list){
		System.out.println(sdto.getSid()+" "+sdto.getSname()+" "+sdto.getMarks());
	}
	
}
}
