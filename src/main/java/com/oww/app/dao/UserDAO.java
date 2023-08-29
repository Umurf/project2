package com.oww.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.dto.UserDTO;

public class UserDAO {
	
	public SqlSession sqlSession;

	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(UserDTO UserDTO) {
		sqlSession.insert("user.join",UserDTO);	
	}
}