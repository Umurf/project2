package com.oww.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.dto.UserDTO;

public class UserDAO {
	
	public SqlSession sqlSession;

	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(UserDTO userDTO) {
		sqlSession.insert("user.join",userDTO);	
	}
	public UserDTO login(UserDTO userDTO) {
		UserDTO user = sqlSession.selectOne("user.login", userDTO);
		return user;
	}
		public boolean checkEmail(String userEmail) {
			return (Integer)sqlSession.selectOne("user.checkEmail", userEmail) <= 0;
	}
	
}