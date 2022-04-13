package com.nexus.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nexusempl")
public class NexusEmploye {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
		private int id;
	@Column(name="name")
	private String name;
	@Column(name = "age", length = 3)
	private int age;
	@Column(name = "mobino",length=10)
	private long mobino;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "password", nullable = false)
	private String  password;
	@Column(name = "location")
	private String location;
	@Column(name = "isActive")
	private boolean is_active;
	@Column(name="dept")
	private String dept;
	@Column(name="salary")
	private int salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobino() {
		return mobino;
	}
	public void setMobino(long mobino) {
		this.mobino = mobino;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
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
	public NexusEmploye(int id, String name, int age, long mobino, String email, String password, String location,
			boolean is_active, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobino = mobino;
		this.email = email;
		this.password = password;
		this.location = location;
		this.is_active = is_active;
		this.dept = dept;
		this.salary = salary;
	}
	public NexusEmploye() {
		super();
		// TODO Auto-generated constructor stub
	}
}
