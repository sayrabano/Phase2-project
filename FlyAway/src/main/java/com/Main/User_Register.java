package com.Main;

 //Simple pojo class for User/Paseenger...
public class User_Register {
	@Override
	public String toString() {
		return "User_Register [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", mobile_no=" + mobile_no + ", address=" + address + "]";
	}

	private int id;
	
	public User_Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_Register(int id, String first_name, String last_name, String email, String mobile_no, String address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.mobile_no = mobile_no;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String first_name;

	private String last_name;
	


	private String email;
	
	private String mobile_no;
	
	private String address;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
