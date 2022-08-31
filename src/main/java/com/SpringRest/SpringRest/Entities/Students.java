package com.SpringRest.SpringRest.Entities;
import javax.persistence.*;

public class Students {
	
	
	private long id;
	private String Name;
	private String address;
	private int age;
	public Students(long id, String name, String address, int age) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
		this.age = age;
	}
	public Students() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", Name=" + Name + ", address=" + address + ", age=" + age + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
