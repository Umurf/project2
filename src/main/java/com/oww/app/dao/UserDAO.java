package com.oww.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.dto.UserDTO;
import com.oww.app.vo.SearchVO;

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
		
		public boolean checkNickname(String userNickname) {
			return (Integer)sqlSession.selectOne("user.checkNickname", userNickname) <= 0;
	}
		
		public List<UserDTO> searchByEmail(SearchVO searchVO) {
			return sqlSession.selectList("user.searchByEmail", searchVO);
		}
		
		public List<UserDTO> searchByNickname(SearchVO searchVO) {
			return sqlSession.selectList("user.searchByNickname", searchVO);
		}
}





