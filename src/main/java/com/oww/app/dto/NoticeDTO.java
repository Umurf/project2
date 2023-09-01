package com.oww.app.dto;

import java.sql.Timestamp;

public class NoticeDTO {

//	CREATE TABLE tbl_notice (
//		    notice_number int unsigned auto_increment NOT NULL,
//		    user_number int NOT NULL,
//		    notice_title varchar(50) NOT NULL,
//		    notice_date timestamp NOT NULL,
//		    notice_content varchar(1000) NOT NULL,
//		    notice_count int NOT NULL
//		);
	
	private int noticeNumber;
	private int userNumber;
	private String noticeTitle;
	private Timestamp noticeDate;
	private String noticeContent;
	private int noticeCount;
	
	public NoticeDTO() {;}

	public int getNoticeNumber() {
		return noticeNumber;
	}

	public void setNoticeNumber(int noticeNumber) {
		this.noticeNumber = noticeNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public Timestamp getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public int getNoticeCount() {
		return noticeCount;
	}

	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}

	@Override
	public String toString() {
	      return noticeNumber + "," + noticeTitle + "," + noticeContent + "," 
	              + noticeDate+ "," + noticeCount;
	}
	
	
	
	
}
