package com.oww.app.dao;

import org.apache.ibatis.session.SqlSession;

public class FuploadDAO {
	public SqlSession sqlSession;
	
	public void delete(int fboardNumber) {
		sqlSession.delete("fupload.delete", fboardNumber);
		}
}
