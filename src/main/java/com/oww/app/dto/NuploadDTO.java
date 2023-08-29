package com.oww.app.dto;

public class NuploadDTO {
//	CREATE TABLE tbl_nupload (
//		    fupload_number int unsigned auto_increment NOT NULL,
//		    notice_number int NOT NULL,
//		    fupload_route varchar(500) NULL,
//		    fupload_extension varchar(30) NULL,
//		    fupload_name varchar(50) NULL
//		);
	
	private int nuploadNumber;
	private int noticeNumber;
	private String nuploadRoute;
	private String nuploadExtension;
	private String nuploadName;
	
	public NuploadDTO() {;}

	public int getNuploadNumber() {
		return nuploadNumber;
	}

	public void setNuploadNumber(int nuploadNumber) {
		this.nuploadNumber = nuploadNumber;
	}

	public int getNoticeNumber() {
		return noticeNumber;
	}

	public void setNoticeNumber(int noticeNumber) {
		this.noticeNumber = noticeNumber;
	}

	public String getNuploadRoute() {
		return nuploadRoute;
	}

	public void setNuploadRoute(String nuploadRoute) {
		this.nuploadRoute = nuploadRoute;
	}

	public String getNuploadExtension() {
		return nuploadExtension;
	}

	public void setNuploadExtension(String nuploadExtension) {
		this.nuploadExtension = nuploadExtension;
	}

	public String getNuploadName() {
		return nuploadName;
	}

	public void setNuploadName(String nuploadName) {
		this.nuploadName = nuploadName;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
