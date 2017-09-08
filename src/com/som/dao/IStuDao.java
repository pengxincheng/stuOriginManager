package com.som.dao;

import java.util.List;

import com.som.entity.Student;

public interface IStuDao {
	 Student findById(int id);

	 List<Student> findByName(String name);

	 List<Student> findByOrigin(String origin);

	 List<Student> findAll();

	 void add(Student stu);

	 void deleteById(int id);

	 void update(Student stu);

}
