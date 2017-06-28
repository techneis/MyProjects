/**
 * 
 */
package com.techneis.objects;

/**
 * @author Neeraj
 *
 */
public class Student {
	
	private int rollNo;
	private String name;
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String name, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
	}
	
}
