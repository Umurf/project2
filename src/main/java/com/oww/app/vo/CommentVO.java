package com.oww.app.vo;

import java.sql.Timestamp;

public class CommentVO {
//	comment_number
//	comment_content
//	comment_date
//	fboard_number
//	u.user_number
//	user_email
	
	private int commentNumber;
	private int fboardNumber;
	private int userNumber;
	private String commentContent;
	private Timestamp commentDate;
	private String userNickname;
	
	public CommentVO(){;}

	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public int getFboardNumber() {
		return fboardNumber;
	}

	public void setFboardNumber(int fboardNumber) {
		this.fboardNumber = fboardNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Timestamp getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserEmail(String userNickname) {
		this.userNickname = userNickname;
	}

	@Override
	public String toString() {
		return commentNumber + fboardNumber + userNumber + commentContent
				+ commentDate + userNickname;
	}
	
	
	
	
}
