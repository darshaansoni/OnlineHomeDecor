package com.yash.onlineHomeDecor.domain;

public class Admin {

	public Admin(String username, String password, String confirmPassword, String contactNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	public Admin(int id, String username, String password, String confirmPassword, String contactNumber, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int id;
	private String username;
	private String password;
	private String confirmPassword;
	private String contactNumber;
	private String email;
}
