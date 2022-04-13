package com.nexus.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nexustech")
public class Nexus {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
	private int id;
@Column(name="name")
private String name;
@Column(name="dept")
private String dept;
@Column(name="salary")
private int salary;
public Nexus() {
	super();
	// TODO Auto-generated constructor stub
}
public Nexus(int id, String name, String dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
