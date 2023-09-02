package com.oww.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.dto.FboardDTO;
import com.oww.app.vo.FboardVO;

public class FboardDAO {
	public SqlSession sqlSession;
	
	public FboardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<FboardVO> selectAll(){
		return sqlSession.selectList("fboard.selectAll");
	}
	public void insert(FboardDTO fboardDTO) {
		sqlSession.insert("fboard.insert", fboardDTO);
		}
}