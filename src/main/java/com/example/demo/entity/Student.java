package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student
{
private @Id @GeneratedValue int id;
private String name;
private int mark;

public void setMark(int mark) {
	// TODO Auto-generated method stub
	this.mark=mark;
}

public void setName(String name) {
	// TODO Auto-generated method stub
	this.name=name;
}

public String getName() {
	// TODO Auto-generated method stub
	return this.name;
}

public Integer getMark() {
	// TODO Auto-generated method stub
	return this.mark;
}

public Integer getId() {
	// TODO Auto-generated method stub
	return id;
}


}
