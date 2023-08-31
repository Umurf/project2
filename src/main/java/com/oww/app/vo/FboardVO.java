package com.oww.app.vo;

import java.sql.Timestamp;

public class FboardVO {
//	u.user_number
//	u.user_email
//	f.fboard_number
//	f.fboard_title
//	f.fboard_content, 
//	f.fboard_date
//	f.fboard_count 
	
	private int userNumber;
	private String userEmail;
	private int fboardNumber;
	private String fboardTitle;
	private String fboardContent;
	private Timestamp fboardDate;
	private int fboardCount;
	
	public FboardVO() { ; }

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getFboardNumber() {
		return fboardNumber;
	}

	public void setFboardNumber(int fboardNumber) {
		this.fboardNumber = fboardNumber;
	}

	public String getFboardTitle() {
		return fboardTitle;
	}

	public void setFboardTitle(String fboardTitle) {
		this.fboardTitle = fboardTitle;
	}

	public String getFboardContent() {
		return fboardContent;
	}

	public void setFboardContent(String fboardContent) {
		this.fboardContent = fboardContent;
	}

	public Timestamp getFboardDate() {
		return fboardDate;
	}

	public void setFboardDate(Timestamp fboardDate) {
		this.fboardDate = fboardDate;
	}

	public int getFboardCount() {
		return fboardCount;
	}

	public void setFboardCount(int fboardCount) {
		this.fboardCount = fboardCount;
	}

	@Override
	public String toString() {
		 return userNumber + "," + userEmail+ "," + fboardNumber + "," + fboardTitle + ","
		            + fboardContent + "," + fboardDate+ "," + fboardCount;
		      
	}
	
	
}
