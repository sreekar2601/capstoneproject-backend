package com.capstone.capstonebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineers")
public class Engineer {
	
	@Id
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="address")
	private String address;
	@Column(name="phonenumber")
	private double phonenumber;
	@Column(name="area")
	private String area;
	@Column(name="salary")
	private int salary;
	@Column(name="timings")
	private String timings;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	
	
	
	public Engineer() {
		
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Engineer(String name, int age, String address, double phonenumber, String area, int salary, String timings) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phonenumber = phonenumber;
		this.area = area;
		this.salary = salary;
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Engineer [name=" + name + ", age=" + age + ", address=" + address + ", phonenumber=" + phonenumber
				+ ", area=" + area + ", salary=" + salary + ", timings=" + timings + "]";
	}
	

}
