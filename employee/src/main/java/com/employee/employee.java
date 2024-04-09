package com.employee;

public class employee {

	private int id;
	private String name;
	private String address;
	private String email;
	private String phoneNo;
	private String user;
	private String password;

	public employee(int id, String name, String address, String email, String phoneNo, String user, String password) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		this.user = user;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}

}
