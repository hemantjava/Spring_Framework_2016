package com.sonu.spring.dao;

import java.util.List;

import com.sonu.spring.model.StudentDTO;

public interface CurdDao {
void save(StudentDTO save);
void update(StudentDTO update);
void delete(StudentDTO delete);
List<StudentDTO> findStudent();
}
