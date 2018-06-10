package com.newtech.vo;

import java.sql.Date;

public class UserBean {

	private int user_id;
	private String user_username;
	private String user_password;
	private String user_email;
	private Date user_indate;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Date getUser_indate() {
		return user_indate;
	}
	public void setUser_indate(Date user_indate) {
		this.user_indate = user_indate;
	}
}
