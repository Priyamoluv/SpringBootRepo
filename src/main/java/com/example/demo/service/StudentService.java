package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;
@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;

public Student createStudent(Student student) {
	return studentRepository.save(student);
}

public List<Student> createStudents(List<Student> students) {
	return studentRepository.saveAll(students);
}

public Student getStudentById(int id)
{
	return studentRepository.findById(id).orElse(null);	
}

public List<Student> getStudents()
{
	return studentRepository.findAll();	
}

public Student updateStudent(Student student) {
Optional<Student> optionalStudent=studentRepository.findById(student.getId());
Student oldStudent;
if(optionalStudent.isPresent()) {
	oldStudent=optionalStudent.get(); 
	oldStudent.setMark(student.getMark());
	studentRepository.save(oldStudent);
}
else
{
	return new Student();
}
return oldStudent;
}

public  String deleteStudentById(int id) {
	studentRepository.deleteById(id);
	return "Student got deleted";
	
}
}
