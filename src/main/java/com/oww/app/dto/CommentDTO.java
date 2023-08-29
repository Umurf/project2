package com.oww.app.dto;

import java.sql.Timestamp;

public class CommentDTO {

//	CREATE TABLE tbl_comment (
//		    comment_number int unsigned auto_increment NOT NULL,
//		    fboard_number int NOT NULL,
//		    user_number int NOT NULL,
//		    comment_content varchar(500) NOT NULL,
//		    comment_date timestamp NOT NULL
//		);
	
	private int commentNumber;
	private int fboardNumber;
	private int userNumber;
	private String commentContent;
	private Timestamp commentDate;
	
	
	//기본생성자
	public CommentDTO() { ; }
	
	//get,set
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
}
