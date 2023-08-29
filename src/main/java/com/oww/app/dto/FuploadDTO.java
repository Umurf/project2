package com.oww.app.dto;

public class FuploadDTO {
//	CREATE TABLE tbl_fupload (
//		    fupload_number int unsigned auto_increment NOT NULL,
//		    fboard_number int NOT NULL,
//		    fupload_route varchar(500) NULL,
//		    fupload_extension varchar(30) NULL,
//		    fupload_name varchar(50) NULL
//		);
	
	private int fuploadNumber;
	private int fboardNumber;
	private String fuploadRoute;
	private String fuploadExtension;
	private String fuploadName;
	
	public FuploadDTO() {;}

	public int getFuploadNumber() {
		return fuploadNumber;
	}

	public void setFuploadNumber(int fuploadNumber) {
		this.fuploadNumber = fuploadNumber;
	}

	public int getFboardNumber() {
		return fboardNumber;
	}

	public void setFboardNumber(int fboardNumber) {
		this.fboardNumber = fboardNumber;
	}

	public String getFuploadRoute() {
		return fuploadRoute;
	}

	public void setFuploadRoute(String fuploadRoute) {
		this.fuploadRoute = fuploadRoute;
	}

	public String getFuploadExtension() {
		return fuploadExtension;
	}

	public void setFuploadExtension(String fuploadExtension) {
		this.fuploadExtension = fuploadExtension;
	}

	public String getFuploadName() {
		return fuploadName;
	}

	public void setFuploadName(String fuploadName) {
		this.fuploadName = fuploadName;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
