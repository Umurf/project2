package com.oww.app.dto;

import java.sql.Timestamp;

public class UserDTO {
	
//	CREATE TABLE tbl_user (
//		    user_number int unsigned auto_increment NOT NULL,
//		    user_email varchar(50) NOT NULL,
//		    user_nickname varchar(50) NOT NULL,
//		    user_password varchar(255) NOT NULL,
//		    user_date timestamp NOT NULL,
//		    user_level char(1) NULL DEFAULT '1'
//		);
	
	private int userNumber;
	private String userEmail;
	private String userNickname;
	private String userPassword;
	private Timestamp userDate;
	private char userLevel;
	
	public UserDTO() {;}
	
	public Integer getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Timestamp getUserDate() {
		return userDate;
	}
	public void setUserDate(Timestamp userDate) {
		this.userDate = userDate;
	}
	public char getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(char userLevel) {
		this.userLevel = userLevel;
	}
	
	@Override
	public String toString() {
	      return "UserDTO [userNumber = " + userNumber + 
	            ", userEmail = " + userEmail + ", userPassword = " + userPassword
	            + ", userNickname = " + userNickname + ", userDate = " + userDate
	            + ", userLevel = " + userLevel + "]";
	}
	
	
}
